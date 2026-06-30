package c61;

/* loaded from: classes8.dex */
public final class d3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f120465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f120466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120467f;

    public d3(boolean z17, int i17, android.content.Context context) {
        this.f120465d = z17;
        this.f120466e = i17;
        this.f120467f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f120465d) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).hj(10);
        } else {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).hj(12);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_create_scene", 1);
        int i18 = this.f120466e;
        android.content.Context context = this.f120467f;
        if (i18 <= 0 || !(context instanceof android.app.Activity)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).qj(context, intent);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).rj((android.app.Activity) context, intent, i18);
        }
    }
}
