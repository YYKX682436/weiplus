package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.l5 f105704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var) {
        super(0);
        this.f105704d = l5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.RedDotFreqCtrlInfoStorage", "deleteAll result=" + this.f105704d.f105650b.f105874d.delete("FinderRedDotFreqControl", "", null));
        return jz5.f0.f302826a;
    }
}
