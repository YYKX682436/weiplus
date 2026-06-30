package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class t implements ik1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166686a;

    public t(java.lang.String str) {
        this.f166686a = str;
    }

    @Override // ik1.h
    /* renamed from: invoke */
    public boolean mo51793xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v task = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(task.f166770a, this.f166686a);
        if (b17) {
            try {
                task.f166775f.cancel(true);
            } catch (java.lang.Exception unused) {
            }
        }
        return b17;
    }
}
