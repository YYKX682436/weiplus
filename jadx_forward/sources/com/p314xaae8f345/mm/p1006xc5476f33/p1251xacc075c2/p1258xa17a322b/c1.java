package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f174111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(java.util.List list) {
        super(1);
        this.f174111d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        qo1.j0 it = (qo1.j0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.b()) {
            this.f174111d.add((qo1.f0) it);
        }
        return java.lang.Boolean.valueOf((it instanceof qo1.f0) && it.d().f384366d != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_INITED);
    }
}
