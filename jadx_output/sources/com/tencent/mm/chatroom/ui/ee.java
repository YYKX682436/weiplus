package com.tencent.mm.chatroom.ui;

/* loaded from: classes9.dex */
public class ee extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f64137o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f64138p;

    /* renamed from: q, reason: collision with root package name */
    public int f64139q;

    /* renamed from: r, reason: collision with root package name */
    public final int f64140r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f64141s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI f64142t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI, android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        super(context, new com.tencent.mm.storage.f9());
        this.f64142t = selectedMemberChattingRecordUI;
        this.f64139q = -1;
        this.f64140r = -1;
        this.f64140r = i17;
        this.f64137o = str;
        this.f64138p = str2;
        this.f64141s = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(selectedMemberChattingRecordUI.f64003h);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
        if (f9Var == null) {
            f9Var = new com.tencent.mm.storage.f9();
        }
        f9Var.convertFrom(cursor);
        return f9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ad, code lost:
    
        if (r1 == null) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0476  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            Method dump skipped, instructions count: 1924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.ee.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        int i17 = this.f64139q;
        int i18 = this.f64140r;
        if (i17 < 0 || i17 > i18) {
            this.f64139q = i18 - 16;
        }
        com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI = this.f64142t;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(selectedMemberChattingRecordUI.f64004i);
        java.lang.String str = this.f64137o;
        if (!K0 && c01.z1.J(selectedMemberChattingRecordUI.f64004i)) {
            s(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().c5(str, i18 - this.f64139q));
        } else {
            if (c01.z1.J(selectedMemberChattingRecordUI.f64004i)) {
                return;
            }
            s(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b5(str, this.f64138p, i18 - this.f64139q));
        }
    }

    public boolean t(java.lang.CharSequence charSequence, android.widget.TextView textView) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence));
        textView.setVisibility(0);
        return true;
    }
}
