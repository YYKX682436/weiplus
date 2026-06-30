package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes5.dex */
public class o implements kg1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f165698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg1.a f165699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f165700c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a f165701d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a activityC12309x37262e4a, java.util.Map map, lg1.a aVar, android.content.Context context) {
        this.f165701d = activityC12309x37262e4a;
        this.f165698a = map;
        this.f165699b = aVar;
        this.f165700c = context;
    }

    @Override // kg1.l
    public void a(kg1.m mVar) {
        int mo143394xfb85f7b0 = mVar.f389239a.mo143394xfb85f7b0();
        kg1.g gVar = mVar.f389239a;
        int b17 = gVar.b();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(b17);
        java.util.Map map = this.f165698a;
        lg1.a aVar = map.containsKey(valueOf) ? (lg1.a) map.get(java.lang.Integer.valueOf(b17)) : this.f165699b;
        kg1.a b18 = mVar.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a activityC12309x37262e4a = this.f165701d;
        android.content.Context context = this.f165700c;
        if (mo143394xfb85f7b0 == 1) {
            lg1.c cVar = new lg1.c(context);
            cVar.m145732x7650364e((lg1.b) activityC12309x37262e4a.f165652u.get(((kg1.h) mVar.b()).f389227b));
            aVar.addView(cVar);
            return;
        }
        lg1.a aVar2 = new lg1.a(context, mo143394xfb85f7b0 == 3);
        if (map.size() > 0) {
            aVar2.m145730x2e3e4924(true);
        }
        if (b18 != null) {
            aVar2.m145731x7650364e((lg1.b) activityC12309x37262e4a.f165652u.get(((kg1.h) b18).f389227b));
        }
        aVar.addView(aVar2);
        map.put(java.lang.Integer.valueOf(gVar.c()), aVar2);
    }
}
