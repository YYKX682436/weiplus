package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.p736xd2ae381c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/flutter/EcsFinderFeedProductFlutterView;", "Landroid/widget/FrameLayout;", "Ll20/p0;", "", "naviHeight", "Ljz5/f0;", "setNaviHeight", "Lk20/g;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setOnFeedBackListener", "", "jsonStr", "setFinderCardInfo", "getEcsReportDataForFinder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView */
/* loaded from: classes11.dex */
public final class C10551xa9bbe48b extends android.widget.FrameLayout implements l20.p0 {

    /* renamed from: d, reason: collision with root package name */
    public pi0.n1 f147440d;

    /* renamed from: e, reason: collision with root package name */
    public pi0.l1 f147441e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.ecs.C23637xffe35977 f147442f;

    /* renamed from: g, reason: collision with root package name */
    public m20.a f147443g;

    /* renamed from: h, reason: collision with root package name */
    public k20.g f147444h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f147445i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.qf f147446m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f147447n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10551xa9bbe48b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // l20.p0, k20.h
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsFinderFeedProductFlutterView", "onFocusChange: isFocus=" + z17);
        if (z17) {
            mo44334x57429eec();
            com.p314xaae8f345.p2845xc516c4b6.ecs.C23637xffe35977 c23637xffe35977 = this.f147442f;
            if (c23637xffe35977 != null) {
                c23637xffe35977.m87615xaf972a39(m20.e.f404507d);
                return;
            }
            return;
        }
        mo44333xb01dfb57();
        com.p314xaae8f345.p2845xc516c4b6.ecs.C23637xffe35977 c23637xffe359772 = this.f147442f;
        if (c23637xffe359772 != null) {
            c23637xffe359772.m87614xc397aae6(m20.f.f404508d);
        }
    }

    @Override // k20.h
    public void b() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 m137427x4255efe8;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137856x3b5b91dc;
        java.lang.String str;
        pi0.k0 a17;
        pi0.l1 l1Var = this.f147441e;
        if (l1Var != null && (str = l1Var.f436180f) != null && (a17 = pi0.k0.f436162c.a(str)) != null) {
            a17.a("HybridNavPageState.DidDisappear");
        }
        com.p314xaae8f345.p2845xc516c4b6.ecs.C23637xffe35977 c23637xffe35977 = this.f147442f;
        if (c23637xffe35977 != null) {
            c23637xffe35977.m87616x903173b4(m20.g.f404509d);
        }
        this.f147444h = null;
        m20.a aVar = this.f147443g;
        if (aVar != null) {
            aVar.f404498a = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsFinderFeedProductFlutterView", "释放 Flutter 资源");
        pi0.l1 l1Var2 = this.f147441e;
        if (l1Var2 != null && (c28580x69eec95e = l1Var2.f436181g) != null && (m137427x4255efe8 = c28580x69eec95e.m137427x4255efe8()) != null && (m137856x3b5b91dc = m137427x4255efe8.m137856x3b5b91dc()) != null) {
            com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23645x80ccca4a.Companion.m87625x97a46f3a(com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23645x80ccca4a.INSTANCE, m137856x3b5b91dc, null, null, 4, null);
        }
        pi0.n1 n1Var = this.f147440d;
        if (n1Var != null) {
            n1Var.a();
        }
        this.f147440d = null;
        pi0.l1 l1Var3 = this.f147441e;
        if (l1Var3 != null) {
            android.content.Context context = getContext();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
            p3325xe03a0797.p3326xc267989b.l.d(activityC0065xcd7aa112 != null ? p012xc85e97e9.p093xedfae76a.z.a(activityC0065xcd7aa112) : p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new m20.h(l1Var3, this, null), 3, null);
        }
        this.f147441e = null;
        this.f147442f = null;
        this.f147443g = null;
        this.f147445i = false;
    }

    @Override // l20.p0
    public void c(bw5.qf data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!this.f147445i) {
            this.f147446m = data;
            return;
        }
        byte[] mo14344x5f01b1f6 = data.mo14344x5f01b1f6();
        com.p314xaae8f345.p2845xc516c4b6.ecs.C23637xffe35977 c23637xffe35977 = this.f147442f;
        if (c23637xffe35977 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            c23637xffe35977.m87619x42dd5ce0(mo14344x5f01b1f6, m20.b.f404499d);
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
    public final java.lang.Object d(p012xc85e97e9.p093xedfae76a.o r31, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r32, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r33) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.p736xd2ae381c.C10551xa9bbe48b.d(androidx.lifecycle.o, androidx.appcompat.app.AppCompatActivity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // k20.h
    /* renamed from: getEcsReportDataForFinder */
    public java.lang.String mo44310x3a31b212() {
        bw5.qf qfVar = this.f147446m;
        if (qfVar == null) {
            return "";
        }
        return "{\"productid\": " + qfVar.f113600d + ", \"extraJson\": " + qfVar.b() + '}';
    }

    @Override // k20.h
    /* renamed from: onPause */
    public void mo44333xb01dfb57() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause, flutterInstance=");
        sb6.append(this.f147441e);
        sb6.append(", engineId=");
        pi0.l1 l1Var = this.f147441e;
        sb6.append(l1Var != null ? l1Var.f436180f : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsFinderFeedProductFlutterView", sb6.toString());
        pi0.l1 l1Var2 = this.f147441e;
        if (l1Var2 == null || (str = l1Var2.f436180f) == null) {
            return;
        }
        pi0.k0 a17 = pi0.k0.f436162c.a(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsFinderFeedProductFlutterView", "onPause, pageState=" + a17);
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
    /* renamed from: onResume */
    public void mo44334x57429eec() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume, flutterInstance=");
        sb6.append(this.f147441e);
        sb6.append(", engineId=");
        pi0.l1 l1Var = this.f147441e;
        sb6.append(l1Var != null ? l1Var.f436180f : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsFinderFeedProductFlutterView", sb6.toString());
        pi0.l1 l1Var2 = this.f147441e;
        if (l1Var2 == null || (str = l1Var2.f436180f) == null) {
            return;
        }
        pi0.k0 a17 = pi0.k0.f436162c.a(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsFinderFeedProductFlutterView", "onResume, pageState=" + a17);
        if (a17 != null) {
            a17.a("HybridNavPageState.DidAppear");
        }
        if (a17 != null) {
            a17.a("HybridNavPageState.Resumed");
        }
    }

    @Override // k20.h
    /* renamed from: setFinderCardInfo */
    public void mo44336x6b1fd726(java.lang.String jsonStr) {
        com.p314xaae8f345.p2845xc516c4b6.ecs.C23637xffe35977 c23637xffe35977;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
        this.f147447n = jsonStr;
        if (this.f147445i) {
            if (!(jsonStr.length() > 0) || (c23637xffe35977 = this.f147442f) == null) {
                return;
            }
            c23637xffe35977.m87617x6b1fd726(jsonStr, m20.i.f404513d);
        }
    }

    @Override // k20.h
    /* renamed from: setNaviHeight */
    public void mo44337x56b82a6f(int i17) {
        if (!this.f147445i || i17 <= 0) {
            return;
        }
        float f17 = i17 / getContext().getResources().getDisplayMetrics().density;
        com.p314xaae8f345.p2845xc516c4b6.ecs.C23637xffe35977 c23637xffe35977 = this.f147442f;
        if (c23637xffe35977 != null) {
            c23637xffe35977.m87618x56b82a6f(f17, m20.j.f404514d);
        }
    }

    @Override // k20.h
    /* renamed from: setOnFeedBackListener */
    public void mo44338x2375ab7a(k20.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f147444h = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10551xa9bbe48b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f147447n = "";
    }
}
