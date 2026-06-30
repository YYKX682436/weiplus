package com.tencent.mm.feature.finder.live;

/* loaded from: classes8.dex */
public final class a3 implements zy2.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f66598a;

    public a3(yz5.r rVar) {
        this.f66598a = rVar;
    }

    @Override // zy2.k5
    public void a(int i17, int i18, java.lang.String str, r45.z61 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        yz5.r rVar = this.f66598a;
        if (rVar != null) {
            rVar.C(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, resp);
        }
    }
}
