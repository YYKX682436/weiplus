package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class o0 implements com.p314xaae8f345.mm.p2614xca6eae71.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f274852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f274853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f274854c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f274855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2614xca6eae71.q0 f274856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f274857f;

    public o0(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, com.p314xaae8f345.mm.p2614xca6eae71.q0 q0Var, android.text.Spannable spannable) {
        this.f274852a = f0Var;
        this.f274853b = c19767x257d7f;
        this.f274854c = f0Var2;
        this.f274855d = f0Var3;
        this.f274856e = q0Var;
        this.f274857f = spannable;
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.b1
    public boolean a(com.p314xaae8f345.mm.p2614xca6eae71.a1 item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f274852a;
        if (f0Var.f391649d < this.f274853b.f38864x6ac9171 && (item instanceof com.p314xaae8f345.mm.p2614xca6eae71.b2)) {
            int i19 = com.p314xaae8f345.mm.p2614xca6eae71.e.f274769b;
            com.p314xaae8f345.mm.p2614xca6eae71.e eVar = com.p314xaae8f345.mm.p2614xca6eae71.d.f274766a;
            com.p314xaae8f345.mm.p2614xca6eae71.b2 b2Var = (com.p314xaae8f345.mm.p2614xca6eae71.b2) item;
            java.lang.String key = java.lang.String.valueOf(b2Var.f274753a.f274792d);
            eVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            gr.q qVar = gr.q.f356209a;
            if (((lt0.f) gr.q.f356210b.f356212b).k(key)) {
                this.f274854c.f391649d++;
            } else {
                this.f274855d.f391649d++;
            }
            f0Var.f391649d++;
            this.f274856e.getClass();
            android.graphics.drawable.Drawable a17 = eVar.a(b2Var, true);
            if (a17 != null) {
                this.f274857f.setSpan(new com.p314xaae8f345.mm.p2614xca6eae71.r0(a17, false, i17, i18), i17, i18, 33);
            }
        }
        return false;
    }
}
