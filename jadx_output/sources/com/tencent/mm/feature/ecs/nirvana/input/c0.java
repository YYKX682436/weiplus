package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes15.dex */
public class c0 implements com.tencent.mm.feature.ecs.nirvana.input.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f65732a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f65733b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.autofill.AutofillManager f65734c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.input.w f65735d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.nirvana.input.b0 f65736e = new com.tencent.mm.feature.ecs.nirvana.input.b0(com.tencent.mm.feature.ecs.nirvana.input.a0.NO_TARGET, 0);

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration f65737f;

    /* renamed from: g, reason: collision with root package name */
    public android.util.SparseArray f65738g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.nirvana.input.s f65739h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f65740i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f65741j;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.Rect f65742k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState f65743l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f65744m;

    public c0(android.view.View view, com.tencent.mm.feature.ecs.nirvana.input.w wVar) {
        this.f65732a = view;
        this.f65739h = new com.tencent.mm.feature.ecs.nirvana.input.s(null, view);
        this.f65733b = (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method");
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            this.f65734c = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        } else {
            this.f65734c = null;
        }
        if (i17 >= 30) {
            new com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback(view).install();
        }
        this.f65735d = wVar;
        com.tencent.mm.feature.ecs.nirvana.input.x xVar = new com.tencent.mm.feature.ecs.nirvana.input.x(this);
        wVar.getClass();
        wVar.f65801a = xVar;
        com.tencent.mm.feature.ecs.nirvana.input.t tVar = wVar.f65802b;
        if (tVar != null) {
            ((com.tencent.mm.feature.ecs.nirvana.input.u) tVar).a("TextInputClient.requestExistingInputState", null);
        }
    }

    public final void a() {
        android.view.autofill.AutofillManager autofillManager;
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration;
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill;
        if (android.os.Build.VERSION.SDK_INT < 26 || (autofillManager = this.f65734c) == null || (configuration = this.f65737f) == null || (autofill = configuration.autofill) == null) {
            return;
        }
        if (this.f65738g != null) {
            autofillManager.notifyViewExited(this.f65732a, autofill.uniqueIdentifier.hashCode());
        }
    }

    public final void b(io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (configuration == null || configuration.autofill == null) {
            this.f65738g = null;
            return;
        }
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration[] configurationArr = configuration.fields;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f65738g = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.autofill.uniqueIdentifier.hashCode(), configuration);
            return;
        }
        for (io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration2 : configurationArr) {
            io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
            if (autofill != null) {
                this.f65738g.put(autofill.uniqueIdentifier.hashCode(), configuration2);
                this.f65734c.notifyValueChanged(this.f65732a, autofill.uniqueIdentifier.hashCode(), android.view.autofill.AutofillValue.forText(autofill.editState.text));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r9 == r1.composingEnd) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    @Override // com.tencent.mm.feature.ecs.nirvana.input.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void didChangeEditingState(boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.nirvana.input.c0.didChangeEditingState(boolean, boolean, boolean):void");
    }
}
