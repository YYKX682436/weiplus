package vn2;

/* loaded from: classes2.dex */
public final class w0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f519938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f519940c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f519941d;

    public w0(android.view.View view, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, float f17) {
        this.f519938a = view;
        this.f519939b = context;
        this.f519940c = abstractC14490x69736cb5;
        this.f519941d = f17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        android.widget.TextView textView = (android.widget.TextView) this.f519938a.findViewById(com.p314xaae8f345.mm.R.id.qgl);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(textView != null ? textView.getText() : null, this.f519939b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqi));
        jz5.l[] lVarArr = new jz5.l[4];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f519940c;
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u((abstractC14490x69736cb5 == null || (feedObject3 = abstractC14490x69736cb5.getFeedObject()) == null) ? 0L : feedObject3.m59251x5db1b11()));
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (str2 = feedObject2.m76829x97edf6c0()) == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("session_buffer", str2);
        lVarArr[2] = new jz5.l("click_playpercent", java.lang.Float.valueOf(this.f519941d));
        lVarArr[3] = new jz5.l("watch_later_status", java.lang.Integer.valueOf(b17 ? 1 : 0));
        return kz5.c1.k(lVarArr);
    }
}
