package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes8.dex */
public class i implements com.p314xaae8f345.mm.p1006xc5476f33.fts.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f218949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f218950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.n f218951c;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.fts.n nVar, android.widget.ImageView imageView, android.content.Context context) {
        this.f218951c = nVar;
        this.f218949a = imageView;
        this.f218950b = context;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.fts.k kVar, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.n nVar = this.f218951c;
        nVar.f219309j.remove(str);
        if (z17) {
            android.graphics.Bitmap e17 = nVar.e(str);
            if (str.equals(this.f218949a.getTag())) {
                nVar.f219304e.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fts.h(this, str, e17));
            }
        }
    }
}
