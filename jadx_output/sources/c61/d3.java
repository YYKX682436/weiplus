package c61;

/* loaded from: classes8.dex */
public final class d3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f38932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f38934f;

    public d3(boolean z17, int i17, android.content.Context context) {
        this.f38932d = z17;
        this.f38933e = i17;
        this.f38934f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f38932d) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).hj(10);
        } else {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).hj(12);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_create_scene", 1);
        int i18 = this.f38933e;
        android.content.Context context = this.f38934f;
        if (i18 <= 0 || !(context instanceof android.app.Activity)) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).qj(context, intent);
        } else {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).rj((android.app.Activity) context, intent, i18);
        }
    }
}
