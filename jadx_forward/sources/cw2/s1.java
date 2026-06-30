package cw2;

/* loaded from: classes2.dex */
public final class s1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f305520a;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90) {
        this.f305520a = c15178x4303ff90;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        jz5.l[] lVarArr = new jz5.l[4];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = this.f305520a;
        android.content.Context context = c15178x4303ff90.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        lVarArr[0] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().m75939xb282bd08(5)) : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = c15178x4303ff90.H;
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u((abstractC14490x69736cb5 == null || (feedObject3 = abstractC14490x69736cb5.getFeedObject()) == null) ? 0L : feedObject3.m59251x5db1b11()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = c15178x4303ff90.H;
        lVarArr[2] = new jz5.l("session_buffer", (abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? null : feedObject2.m76829x97edf6c0());
        android.content.Context context2 = c15178x4303ff90.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        lVarArr[3] = new jz5.l("finder_tab_context_id", nyVar2 != null ? nyVar2.V6().m75945x2fec8307(2) : null);
        return kz5.c1.k(lVarArr);
    }
}
