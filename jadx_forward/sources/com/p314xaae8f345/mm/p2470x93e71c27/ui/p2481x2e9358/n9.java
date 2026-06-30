package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class n9 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f272045a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.j8 f272046b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h8 f272047c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f272048d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f272049e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f272050f;

    /* renamed from: h, reason: collision with root package name */
    public db5.d5 f272052h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f272053i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f272054j;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i8 f272056l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m9 f272057m;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f272051g = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f272055k = true;

    public n9(android.content.Context context, android.view.View view, android.view.View view2, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m9 m9Var) {
        this.f272049e = null;
        this.f272050f = null;
        this.f272045a = context;
        this.f272053i = view;
        this.f272054j = view2;
        this.f272046b = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.j8(context);
        this.f272048d = context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        this.f272057m = m9Var;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569972tc, null);
        this.f272049e = inflate;
        this.f272050f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.llu);
        db5.d5 d5Var = new db5.d5(this.f272049e, -2, -2, false);
        this.f272052h = d5Var;
        d5Var.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.f272052h.setOutsideTouchable(true);
        this.f272049e.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i9(this));
    }

    public final float a(int i17) {
        return android.util.TypedValue.applyDimension(1, i17, this.f272045a.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b2, code lost:
    
        if (r0.moveToFirst() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
    
        r3 = r0.getString(r0.getColumnIndexOrThrow("_id"));
        r6 = r0.getString(r0.getColumnIndexOrThrow("_data"));
        r7 = r0.getString(r0.getColumnIndexOrThrow("date_added"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d0, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d6, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r6) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        if (r6.startsWith(lp0.b.m()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentPhotoTips.ImageQuery", "exclude weixin path image");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012c, code lost:
    
        if (r0.moveToNext() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r8 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h8();
        r8.f271884a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(r3, r1);
        r8.f271886c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fe, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0104, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r6) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0106, code lost:
    
        r8.f271885b = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8.f271885b) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8.f271885b) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0118, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecentPhotoTips.ImageQuery", "thumb file and orignal file both not exist");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011f, code lost:
    
        r5.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecentPhotoTips.ImageQuery", "file not exist");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012e, code lost:
    
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h8 b() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n9.b():com.tencent.mm.pluginsdk.ui.chat.h8");
    }
}
