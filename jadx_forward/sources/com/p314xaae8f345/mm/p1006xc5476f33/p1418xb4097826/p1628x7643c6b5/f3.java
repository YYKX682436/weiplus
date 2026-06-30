package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes8.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 f207584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var) {
        super(0);
        this.f207584d = l3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Set set = this.f207584d.f207666s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(set, "access$getEnterFinderActivity$p(...)");
        java.util.Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC0065xcd7aa112.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1.class)) {
                activityC0065xcd7aa112.moveTaskToBack(true);
                break;
            }
        }
        return jz5.f0.f384359a;
    }
}
