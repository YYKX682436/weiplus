package com.tencent.mm.feature.ecs.product.finder_feed.flutter;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/flutter/EcsFinderFeedProductFlutterView;", "Landroid/widget/FrameLayout;", "Ll20/p0;", "", "naviHeight", "Ljz5/f0;", "setNaviHeight", "Lk20/g;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFeedBackListener", "", "jsonStr", "setFinderCardInfo", "getEcsReportDataForFinder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class EcsFinderFeedProductFlutterView extends android.widget.FrameLayout implements l20.p0 {

    /* renamed from: d, reason: collision with root package name */
    public pi0.n1 f65907d;

    /* renamed from: e, reason: collision with root package name */
    public pi0.l1 f65908e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.pigeon.ecs.EcsFinderFeedFlutterApi f65909f;

    /* renamed from: g, reason: collision with root package name */
    public m20.a f65910g;

    /* renamed from: h, reason: collision with root package name */
    public k20.g f65911h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f65912i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.qf f65913m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f65914n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductFlutterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // l20.p0, k20.h
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("EcsFinderFeedProductFlutterView", "onFocusChange: isFocus=" + z17);
        if (z17) {
            onResume();
            com.tencent.pigeon.ecs.EcsFinderFeedFlutterApi ecsFinderFeedFlutterApi = this.f65909f;
            if (ecsFinderFeedFlutterApi != null) {
                ecsFinderFeedFlutterApi.onFocus(m20.e.f322974d);
                return;
            }
            return;
        }
        onPause();
        com.tencent.pigeon.ecs.EcsFinderFeedFlutterApi ecsFinderFeedFlutterApi2 = this.f65909f;
        if (ecsFinderFeedFlutterApi2 != null) {
            ecsFinderFeedFlutterApi2.onBlur(m20.f.f322975d);
        }
    }

    @Override // k20.h
    public void b() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        io.flutter.embedding.engine.dart.DartExecutor dartExecutor;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger;
        java.lang.String str;
        pi0.k0 a17;
        pi0.l1 l1Var = this.f65908e;
        if (l1Var != null && (str = l1Var.f354647f) != null && (a17 = pi0.k0.f354629c.a(str)) != null) {
            a17.a("HybridNavPageState.DidDisappear");
        }
        com.tencent.pigeon.ecs.EcsFinderFeedFlutterApi ecsFinderFeedFlutterApi = this.f65909f;
        if (ecsFinderFeedFlutterApi != null) {
            ecsFinderFeedFlutterApi.onRecycle(m20.g.f322976d);
        }
        this.f65911h = null;
        m20.a aVar = this.f65910g;
        if (aVar != null) {
            aVar.f322965a = null;
        }
        com.tencent.mars.xlog.Log.i("EcsFinderFeedProductFlutterView", "释放 Flutter 资源");
        pi0.l1 l1Var2 = this.f65908e;
        if (l1Var2 != null && (flutterEngine = l1Var2.f354648g) != null && (dartExecutor = flutterEngine.getDartExecutor()) != null && (binaryMessenger = dartExecutor.getBinaryMessenger()) != null) {
            com.tencent.pigeon.ecs.EcsFinderFeedNativeApi.Companion.setUp$default(com.tencent.pigeon.ecs.EcsFinderFeedNativeApi.INSTANCE, binaryMessenger, null, null, 4, null);
        }
        pi0.n1 n1Var = this.f65907d;
        if (n1Var != null) {
            n1Var.a();
        }
        this.f65907d = null;
        pi0.l1 l1Var3 = this.f65908e;
        if (l1Var3 != null) {
            android.content.Context context = getContext();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
            kotlinx.coroutines.l.d(appCompatActivity != null ? androidx.lifecycle.z.a(appCompatActivity) : kotlinx.coroutines.z0.b(), null, null, new m20.h(l1Var3, this, null), 3, null);
        }
        this.f65908e = null;
        this.f65909f = null;
        this.f65910g = null;
        this.f65912i = false;
    }

    @Override // l20.p0
    public void c(bw5.qf data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (!this.f65912i) {
            this.f65913m = data;
            return;
        }
        byte[] byteArray = data.toByteArray();
        com.tencent.pigeon.ecs.EcsFinderFeedFlutterApi ecsFinderFeedFlutterApi = this.f65909f;
        if (ecsFinderFeedFlutterApi != null) {
            kotlin.jvm.internal.o.d(byteArray);
            ecsFinderFeedFlutterApi.updateProductCardData(byteArray, m20.b.f322966d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(androidx.lifecycle.o r31, androidx.appcompat.app.AppCompatActivity r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView.d(androidx.lifecycle.o, androidx.appcompat.app.AppCompatActivity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // k20.h
    public java.lang.String getEcsReportDataForFinder() {
        bw5.qf qfVar = this.f65913m;
        if (qfVar == null) {
            return "";
        }
        return "{\"productid\": " + qfVar.f32067d + ", \"extraJson\": " + qfVar.b() + '}';
    }

    @Override // k20.h
    public void onPause() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause, flutterInstance=");
        sb6.append(this.f65908e);
        sb6.append(", engineId=");
        pi0.l1 l1Var = this.f65908e;
        sb6.append(l1Var != null ? l1Var.f354647f : null);
        com.tencent.mars.xlog.Log.i("EcsFinderFeedProductFlutterView", sb6.toString());
        pi0.l1 l1Var2 = this.f65908e;
        if (l1Var2 == null || (str = l1Var2.f354647f) == null) {
            return;
        }
        pi0.k0 a17 = pi0.k0.f354629c.a(str);
        com.tencent.mars.xlog.Log.i("EcsFinderFeedProductFlutterView", "onPause, pageState=" + a17);
        if (a17 != null) {
            a17.a("HybridNavPageState.WillDisappear");
        }
        if (a17 != null) {
            a17.a("HybridNavPageState.Paused");
        }
        if (a17 != null) {
            a17.a("HybridNavPageState.DidDisappear");
        }
    }

    @Override // k20.h
    public void onResume() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume, flutterInstance=");
        sb6.append(this.f65908e);
        sb6.append(", engineId=");
        pi0.l1 l1Var = this.f65908e;
        sb6.append(l1Var != null ? l1Var.f354647f : null);
        com.tencent.mars.xlog.Log.i("EcsFinderFeedProductFlutterView", sb6.toString());
        pi0.l1 l1Var2 = this.f65908e;
        if (l1Var2 == null || (str = l1Var2.f354647f) == null) {
            return;
        }
        pi0.k0 a17 = pi0.k0.f354629c.a(str);
        com.tencent.mars.xlog.Log.i("EcsFinderFeedProductFlutterView", "onResume, pageState=" + a17);
        if (a17 != null) {
            a17.a("HybridNavPageState.DidAppear");
        }
        if (a17 != null) {
            a17.a("HybridNavPageState.Resumed");
        }
    }

    @Override // k20.h
    public void setFinderCardInfo(java.lang.String jsonStr) {
        com.tencent.pigeon.ecs.EcsFinderFeedFlutterApi ecsFinderFeedFlutterApi;
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        this.f65914n = jsonStr;
        if (this.f65912i) {
            if (!(jsonStr.length() > 0) || (ecsFinderFeedFlutterApi = this.f65909f) == null) {
                return;
            }
            ecsFinderFeedFlutterApi.setFinderCardInfo(jsonStr, m20.i.f322980d);
        }
    }

    @Override // k20.h
    public void setNaviHeight(int i17) {
        if (!this.f65912i || i17 <= 0) {
            return;
        }
        float f17 = i17 / getContext().getResources().getDisplayMetrics().density;
        com.tencent.pigeon.ecs.EcsFinderFeedFlutterApi ecsFinderFeedFlutterApi = this.f65909f;
        if (ecsFinderFeedFlutterApi != null) {
            ecsFinderFeedFlutterApi.setNaviHeight(f17, m20.j.f322981d);
        }
    }

    @Override // k20.h
    public void setOnFeedBackListener(k20.g listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f65911h = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductFlutterView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f65914n = "";
    }
}
