package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class z3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {
    public final /* synthetic */ java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 f192323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 activityC13958x14958e88) {
        super(1);
        this.C = str;
        this.f192323d = activityC13958x14958e88;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 activityC13958x14958e88 = this.f192323d;
        java.lang.String str = activityC13958x14958e88.B;
        java.lang.String str2 = this.C;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            activityC13958x14958e88.d7(fVar != null ? fVar.f152148a : 0, fVar != null ? fVar.f152149b : 0, fVar != null ? (r45.tu2) fVar.f152151d : null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGallerySearchUI", "ignore expired search next page result, currentRequestId:" + str2 + " requestId:" + activityC13958x14958e88.B);
        }
        return jz5.f0.f384359a;
    }
}
