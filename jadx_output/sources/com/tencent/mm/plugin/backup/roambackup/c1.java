package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f92578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(java.util.List list) {
        super(1);
        this.f92578d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        qo1.j0 it = (qo1.j0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.b()) {
            this.f92578d.add((qo1.f0) it);
        }
        return java.lang.Boolean.valueOf((it instanceof qo1.f0) && it.d().f302833d != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_INITED);
    }
}
