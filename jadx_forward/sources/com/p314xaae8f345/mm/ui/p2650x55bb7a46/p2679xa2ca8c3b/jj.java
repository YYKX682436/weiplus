package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class jj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl0.g f285795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f285796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285798g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f285799h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285800i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f285801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285802n;

    public jj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, cl0.g gVar, java.util.Map map, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i18) {
        this.f285802n = c21908xb66fd105;
        this.f285795d = gVar;
        this.f285796e = map;
        this.f285797f = str;
        this.f285798g = str2;
        this.f285799h = i17;
        this.f285800i = f9Var;
        this.f285801m = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$58", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cl0.g gVar = this.f285795d;
        if (gVar != null) {
            java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("feedID");
            java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("nonceID");
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285802n;
            ((c61.l7) b6Var).vj(c21908xb66fd105.f284708s.g(), mo15082x48bce8a4, mo15082x48bce8a42, false, 16, qg0.h0.Fg(2));
            this.f285802n.p1(5, this.f285796e, this.f285797f, mo15082x48bce8a4, this.f285798g);
            if (this.f285799h == 1) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ar.f284938a.a(this.f285800i, java.lang.Integer.valueOf(this.f285801m));
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.e0(c21908xb66fd105, (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag(), this.f285796e);
            c21908xb66fd105.s1(3, c21908xb66fd105.f284708s.x(), "");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$58", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
