package a31;

/* loaded from: classes5.dex */
public final class d implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f82481d = "";

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a31.m f82482e;

    public d(a31.m mVar) {
        this.f82482e = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0031  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterTextChanged(android.text.Editable r14) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a31.d.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String str;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        this.f82481d = str;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        a31.m mVar = this.f82482e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32 = mVar.f82502c;
        if ((c19651x7fe9d32 != null ? c19651x7fe9d32.getCurV2TStatus() : 0) >= 2 || (c22621x7603e017 = mVar.f82501b) == null) {
            return;
        }
        java.lang.Runnable runnable = mVar.P;
        c22621x7603e017.removeCallbacks(runnable);
        c22621x7603e017.post(runnable);
    }
}
