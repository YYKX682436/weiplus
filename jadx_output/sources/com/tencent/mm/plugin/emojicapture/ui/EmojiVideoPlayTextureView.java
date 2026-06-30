package com.tencent.mm.plugin.emojicapture.ui;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB!\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u0018¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureView;", "Lcom/tencent/mm/ui/base/MMTextureView;", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "Ljz5/f0;", "setVideoPath", "getVideoPath", "Lcom/tencent/mm/pluginsdk/ui/tools/a4;", "callback", "setVideoCallback", "Lkotlin/Function0;", "setOnDrawCallback", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RATE, "setPlayRate", "", "removeBgEnable", "setRemoveBgEnable", "remove", "setRemoveBackground", "Lt85/j;", "pack", "setSticker", "getPlayRate", "", "getDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EmojiVideoPlayTextureView extends com.tencent.mm.ui.base.MMTextureView {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f98621z = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f98622h;

    /* renamed from: i, reason: collision with root package name */
    public final d32.l f98623i;

    /* renamed from: m, reason: collision with root package name */
    public final y22.g f98624m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f98625n;

    /* renamed from: o, reason: collision with root package name */
    public ph3.k f98626o;

    /* renamed from: p, reason: collision with root package name */
    public int f98627p;

    /* renamed from: q, reason: collision with root package name */
    public int f98628q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f98629r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f98630s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.Surface f98631t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.a4 f98632u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f98633v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f98634w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f98635x;

    /* renamed from: y, reason: collision with root package name */
    public final ph3.d f98636y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiVideoPlayTextureView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f98622h = "MicroMsg.EmojiVideoPlayTextureView";
        d32.l lVar = new d32.l();
        this.f98623i = lVar;
        y22.g gVar = new y22.g(lVar);
        this.f98624m = gVar;
        this.f98625n = "";
        this.f98630s = true;
        setSurfaceTextureListener(gVar);
        setOpaque(false);
        gVar.f459091n = new y22.o(this);
        gVar.f459092o = new y22.p(this);
        this.f98636y = new y22.r(this);
    }

    public final void E() {
        ph3.k kVar;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(hashCode()), this.f98625n};
        java.lang.String str = this.f98622h;
        com.tencent.mars.xlog.Log.i(str, "%d open video [%s]", objArr);
        ph3.k kVar2 = this.f98626o;
        if (kVar2 != null) {
            kVar2.f354429g = null;
            kVar2.stop();
            ph3.k kVar3 = this.f98626o;
            if (kVar3 != null) {
                kVar3.release();
            }
            this.f98626o = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f98625n) || this.f98631t == null) {
            com.tencent.mars.xlog.Log.w(str, "%d open video but path is null or mSurface is null", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        try {
            this.f98629r = false;
            ph3.k kVar4 = new ph3.k(android.os.Looper.getMainLooper(), false, 0);
            this.f98626o = kVar4;
            kVar4.h(this.f98625n);
            ph3.k kVar5 = this.f98626o;
            if (kVar5 != null) {
                kVar5.q(false);
            }
            ph3.k kVar6 = this.f98626o;
            if (kVar6 != null) {
                kVar6.p(false);
            }
            ph3.k kVar7 = this.f98626o;
            if (kVar7 != null) {
                kVar7.f354429g = this.f98636y;
            }
            if (kVar7 != null) {
                kVar7.setSurface(this.f98631t);
            }
            ph3.k kVar8 = this.f98626o;
            if (kVar8 != null) {
                kVar8.f354428f.f354449l.getClass();
            }
            ph3.k kVar9 = this.f98626o;
            if (kVar9 != null) {
                kVar9.setMute(true);
            }
            if (this.f98631t == null || (kVar = this.f98626o) == null) {
                return;
            }
            kVar.prepare();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "prepare async error %s", e17.getMessage());
            com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f98632u;
            if (a4Var != null) {
                a4Var.onError(-1, -1);
            }
        }
    }

    public final int getDuration() {
        ph3.k kVar = this.f98626o;
        if (kVar == null) {
            return 0;
        }
        kotlin.jvm.internal.o.d(kVar);
        return (int) kVar.f354428f.f354443f;
    }

    public final float getPlayRate() {
        ph3.p pVar;
        ph3.k kVar = this.f98626o;
        if (kVar == null) {
            return 1.0f;
        }
        kotlin.jvm.internal.o.d(kVar);
        ph3.o oVar = kVar.f354428f;
        if (oVar == null || (pVar = oVar.f354449l) == null) {
            return 1.0f;
        }
        return pVar.C;
    }

    /* renamed from: getVideoPath, reason: from getter */
    public final java.lang.String getF98625n() {
        return this.f98625n;
    }

    public final void setOnDrawCallback(yz5.a aVar) {
        this.f98633v = aVar;
    }

    public final void setPlayRate(float f17) {
        ph3.k kVar = this.f98626o;
        if (kVar == null) {
            return;
        }
        kVar.c(f17);
    }

    public final void setRemoveBackground(boolean z17) {
        this.f98624m.b(new y22.s(this, z17));
    }

    public final void setRemoveBgEnable(boolean z17) {
    }

    public final void setSticker(t85.j jVar) {
        this.f98624m.b(new y22.t(this, jVar));
    }

    public final void setVideoCallback(com.tencent.mm.pluginsdk.ui.tools.a4 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f98632u = callback;
    }

    public final void setVideoPath(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i(this.f98622h, "%d set video path [%s]", java.lang.Integer.valueOf(hashCode()), path);
        this.f98625n = path;
        E();
        requestLayout();
    }

    public final boolean start() {
        ph3.k kVar = this.f98626o;
        java.lang.String str = this.f98622h;
        if (kVar == null || !this.f98629r) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(hashCode());
            objArr[1] = java.lang.Boolean.valueOf(this.f98626o == null);
            objArr[2] = java.lang.Boolean.valueOf(this.f98629r);
            com.tencent.mars.xlog.Log.w(str, "%d player is null[%b] or it prepared [%b]", objArr);
            return false;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[4];
        objArr2[0] = java.lang.Integer.valueOf(hashCode());
        objArr2[1] = java.lang.Boolean.valueOf(this.f98635x);
        objArr2[2] = java.lang.Boolean.valueOf(this.f98634w);
        objArr2[3] = java.lang.Boolean.valueOf(this.f98631t != null);
        com.tencent.mars.xlog.Log.i(str, "%d player start pauseWhenUpdated[%b] pauseByDestroyed[%b] surface[%b]", objArr2);
        if (this.f98631t == null) {
            this.f98634w = true;
            return true;
        }
        if (this.f98635x) {
            this.f98634w = true;
            this.f98635x = false;
            return true;
        }
        ph3.k kVar2 = this.f98626o;
        if (kVar2 != null) {
            kVar2.start();
        }
        this.f98624m.b(new y22.u(this));
        return true;
    }

    public final void stop() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(this.f98622h, "%d player stop [%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        ph3.k kVar = this.f98626o;
        if (kVar != null) {
            kVar.f354429g = null;
        }
        if (kVar != null) {
            kVar.stop();
        }
        ph3.k kVar2 = this.f98626o;
        if (kVar2 != null) {
            kVar2.release();
        }
        this.f98624m.b(new y22.v(this));
        this.f98626o = null;
        this.f98628q = 0;
        this.f98627p = 0;
        this.f98629r = false;
        this.f98625n = "";
        setSurfaceTextureListener(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiVideoPlayTextureView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f98622h = "MicroMsg.EmojiVideoPlayTextureView";
        d32.l lVar = new d32.l();
        this.f98623i = lVar;
        y22.g gVar = new y22.g(lVar);
        this.f98624m = gVar;
        this.f98625n = "";
        this.f98630s = true;
        setSurfaceTextureListener(gVar);
        setOpaque(false);
        gVar.f459091n = new y22.o(this);
        gVar.f459092o = new y22.p(this);
        this.f98636y = new y22.r(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiVideoPlayTextureView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98622h = "MicroMsg.EmojiVideoPlayTextureView";
        d32.l lVar = new d32.l();
        this.f98623i = lVar;
        y22.g gVar = new y22.g(lVar);
        this.f98624m = gVar;
        this.f98625n = "";
        this.f98630s = true;
        setSurfaceTextureListener(gVar);
        setOpaque(false);
        gVar.f459091n = new y22.o(this);
        gVar.f459092o = new y22.p(this);
        this.f98636y = new y22.r(this);
    }
}
