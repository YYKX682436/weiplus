package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes15.dex */
public class c0 implements com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f147265a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f147266b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.autofill.AutofillManager f147267c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.w f147268d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.b0 f147269e = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.b0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.a0.NO_TARGET, 0);

    /* renamed from: f, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration f147270f;

    /* renamed from: g, reason: collision with root package name */
    public android.util.SparseArray f147271g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s f147272h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f147273i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f147274j;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.Rect f147275k;

    /* renamed from: l, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState f147276l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f147277m;

    public c0(android.view.View view, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.w wVar) {
        this.f147265a = view;
        this.f147272h = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s(null, view);
        this.f147266b = (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method");
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            this.f147267c = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        } else {
            this.f147267c = null;
        }
        if (i17 >= 30) {
            new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921(view).m44260x74ae259b();
        }
        this.f147268d = wVar;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.x xVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.x(this);
        wVar.getClass();
        wVar.f147334a = xVar;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar = wVar.f147335b;
        if (tVar != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar).a("TextInputClient.requestExistingInputState", null);
        }
    }

    public final void a() {
        android.view.autofill.AutofillManager autofillManager;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill autofill;
        if (android.os.Build.VERSION.SDK_INT < 26 || (autofillManager = this.f147267c) == null || (configuration = this.f147270f) == null || (autofill = configuration.f71517x55c963b2) == null) {
            return;
        }
        if (this.f147271g != null) {
            autofillManager.notifyViewExited(this.f147265a, autofill.f71532xf885435a.hashCode());
        }
    }

    public final void b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (configuration == null || configuration.f71517x55c963b2 == null) {
            this.f147271g = null;
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration[] configurationArr = configuration.f71522xb4057eb9;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f147271g = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.f71517x55c963b2.f71532xf885435a.hashCode(), configuration);
            return;
        }
        for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration2 : configurationArr) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill autofill = configuration2.f71517x55c963b2;
            if (autofill != null) {
                this.f147271g.put(autofill.f71532xf885435a.hashCode(), configuration2);
                this.f147267c.notifyValueChanged(this.f147265a, autofill.f71532xf885435a.hashCode(), android.view.autofill.AutofillValue.forText(autofill.f71529x901d9ca7.f71546x36452d));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r9 == r1.f71542xf18c188c) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    @Override // com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.r
    /* renamed from: didChangeEditingState */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo44265x3186bc88(boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0.mo44265x3186bc88(boolean, boolean, boolean):void");
    }
}
