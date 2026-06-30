package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes10.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 f207623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f207624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f207623d = l3Var;
        this.f207624e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gl glVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = this.f207623d;
        android.os.PowerManager powerManager = (android.os.PowerManager) ((jz5.n) l3Var.f207658h).mo141623x754a37bb();
        boolean z17 = !(powerManager != null ? powerManager.isInteractive() : true);
        l3Var.f207657g = z17;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f207624e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) activityC0065xcd7aa112 : null;
            if (abstractActivityC15087xee12defa != null && (glVar = abstractActivityC15087xee12defa.f210343i) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a2) glVar).a("onScreenOff");
            }
        }
        i95.m c17 = i95.n0.c(zy2.gb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((au2.q) ((zy2.gb) c17)).f95621f = l3Var.f207657g;
        return jz5.f0.f384359a;
    }
}
