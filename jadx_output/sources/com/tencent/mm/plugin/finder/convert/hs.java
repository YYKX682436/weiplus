package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hs implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103612b;

    public hs(in5.s0 s0Var, java.lang.String str) {
        this.f103611a = s0Var;
        this.f103612b = str;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.PrivateMsgNotifyConvert", "[getNow] username=" + str + " succ=" + z17);
        ng5.a.b((android.widget.ImageView) this.f103611a.p(com.tencent.mm.R.id.jsx), this.f103612b);
    }
}
