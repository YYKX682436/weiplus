package df;

/* loaded from: classes7.dex */
public final class w0 implements df.d {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Integer f311104c;

    /* renamed from: d, reason: collision with root package name */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxKeyboardType f311105d;

    /* renamed from: e, reason: collision with root package name */
    public static ef.d f311106e;

    /* renamed from: f, reason: collision with root package name */
    public static android.view.inputmethod.InputConnection f311107f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.ref.WeakReference f311108g;

    /* renamed from: a, reason: collision with root package name */
    public static final df.w0 f311102a = new df.w0();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f311103b = df.h.f311009g;

    /* renamed from: h, reason: collision with root package name */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxKeyboardType f311109h = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxKeyboardType.TEXT;

    /* renamed from: i, reason: collision with root package name */
    public static final android.view.inputmethod.EditorInfo f311110i = new android.view.inputmethod.EditorInfo();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.ArrayList f311111j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.List f311112k = new java.util.ArrayList();

    @Override // df.d
    public void a(android.view.inputmethod.InputConnection inputConnection) {
        ef.e eVar;
        f311107f = inputConnection;
        ef.d dVar = f311106e;
        if (dVar != null) {
            ef.m mVar = (ef.m) dVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewExtendInputClient", "onCreateInputConnection");
            if (!mVar.f333662f || inputConnection == null) {
                return;
            }
            if ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.f(mVar.f333668l) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mVar.f333668l, "safe-password")) && (eVar = mVar.f333659c) != null) {
                eVar.i(inputConnection);
            }
        }
    }

    @Override // df.d
    /* renamed from: hideKeyboard */
    public void mo124131x3f895349() {
        ef.d dVar = f311106e;
        if (dVar != null) {
            ((ef.m) dVar).c(null, null);
        }
        java.lang.ref.WeakReference weakReference = f311108g;
        if (weakReference != null) {
            weakReference.clear();
        }
        f311108g = null;
        android.view.inputmethod.InputConnection inputConnection = f311107f;
        if (inputConnection != null) {
            inputConnection.closeConnection();
        }
        f311107f = null;
        f311104c = null;
        f311105d = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(65:37|(1:39)(1:194)|40|(62:44|(2:46|(2:48|(2:50|(1:52))(1:190))(1:191))(1:192)|53|(1:55)(1:189)|56|(1:58)(1:188)|59|(1:61)(1:187)|62|(1:64)(1:186)|65|(1:67)(1:185)|68|(1:70)(1:184)|71|(1:73)(1:183)|74|(1:76)(1:182)|77|78|79|80|81|(38:83|85|86|(1:88)|90|91|92|(1:94)|96|97|(27:99|101|102|(1:104)|106|107|(21:109|110|111|112|(1:114)|116|117|(13:119|120|121|(9:123|124|125|126|(1:128)|130|131|(1:133)(1:154)|(1:153)(4:135|(1:137)|138|(1:152)(4:140|(1:144)|145|(3:(1:148)|149|150)(1:151))))|158|124|125|126|(0)|130|131|(0)(0)|(0)(0))|162|120|121|(0)|158|124|125|126|(0)|130|131|(0)(0)|(0)(0))|168|111|112|(0)|116|117|(0)|162|120|121|(0)|158|124|125|126|(0)|130|131|(0)(0)|(0)(0))|174|101|102|(0)|106|107|(0)|168|111|112|(0)|116|117|(0)|162|120|121|(0)|158|124|125|126|(0)|130|131|(0)(0)|(0)(0))|178|85|86|(0)|90|91|92|(0)|96|97|(0)|174|101|102|(0)|106|107|(0)|168|111|112|(0)|116|117|(0)|162|120|121|(0)|158|124|125|126|(0)|130|131|(0)(0)|(0)(0))|193|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|68|(0)(0)|71|(0)(0)|74|(0)(0)|77|78|79|80|81|(0)|178|85|86|(0)|90|91|92|(0)|96|97|(0)|174|101|102|(0)|106|107|(0)|168|111|112|(0)|116|117|(0)|162|120|121|(0)|158|124|125|126|(0)|130|131|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x026e, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get adjust-position error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0268, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get adjust-position error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x024f, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0249, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0235, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0231, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x021e, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get password error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x021a, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get password error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0207, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0203, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01e9, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01ed, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01e5, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01cf, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo add keyboardType error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01ba, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo add elementTag error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01a9, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo add dartWidgetId error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0193, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo add inputId error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x017a, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo convert to json error");
        r3 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if ((r27 != null ? r27.f71568xc742bc1 : null) != r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r2 = df.w0.f311106e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0045, code lost:
    
        if ((r27 != null ? r27.f71568xc742bc1 : null) != r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r2 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        ((ef.m) r2).c(null, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01dc A[Catch: Exception -> 0x01e5, NumberFormatException -> 0x01e9, JSONException -> 0x01ed, TRY_LEAVE, TryCatch #12 {NumberFormatException -> 0x01e9, JSONException -> 0x01ed, Exception -> 0x01e5, blocks: (B:102:0x01d6, B:104:0x01dc), top: B:101:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f8 A[Catch: Exception -> 0x0203, JSONException -> 0x0207, TRY_LEAVE, TryCatch #18 {JSONException -> 0x0207, Exception -> 0x0203, blocks: (B:107:0x01f2, B:109:0x01f8), top: B:106:0x01f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0211 A[Catch: Exception -> 0x021a, JSONException -> 0x021e, TRY_LEAVE, TryCatch #16 {JSONException -> 0x021e, Exception -> 0x021a, blocks: (B:112:0x020b, B:114:0x0211), top: B:111:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0227 A[Catch: Exception -> 0x0231, JSONException -> 0x0235, TRY_LEAVE, TryCatch #15 {JSONException -> 0x0235, Exception -> 0x0231, blocks: (B:117:0x0221, B:119:0x0227), top: B:116:0x0221 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023f A[Catch: Exception -> 0x0249, JSONException -> 0x024f, TRY_LEAVE, TryCatch #17 {JSONException -> 0x024f, Exception -> 0x0249, blocks: (B:121:0x0239, B:123:0x023f), top: B:120:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025d A[Catch: Exception -> 0x0268, JSONException -> 0x026e, TRY_LEAVE, TryCatch #14 {JSONException -> 0x026e, Exception -> 0x0268, blocks: (B:126:0x0257, B:128:0x025d), top: B:125:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018a A[Catch: JSONException -> 0x0193, TRY_LEAVE, TryCatch #5 {JSONException -> 0x0193, blocks: (B:81:0x0184, B:83:0x018a), top: B:80:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a0 A[Catch: JSONException -> 0x01a9, TRY_LEAVE, TryCatch #10 {JSONException -> 0x01a9, blocks: (B:86:0x019a, B:88:0x01a0), top: B:85:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b6 A[Catch: JSONException -> 0x01ba, TRY_LEAVE, TryCatch #2 {JSONException -> 0x01ba, blocks: (B:92:0x01b0, B:94:0x01b6), top: B:91:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c5 A[Catch: JSONException -> 0x01cf, TRY_LEAVE, TryCatch #17 {JSONException -> 0x01cf, blocks: (B:97:0x01bf, B:99:0x01c5), top: B:96:0x01bf }] */
    @Override // df.d
    /* renamed from: showKeyboard */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo124132xeb3e6604(android.view.View r26, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration r27) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df.w0.mo124132xeb3e6604(android.view.View, io.flutter.embedding.engine.systemchannels.TextInputChannel$WxInputConfiguration):void");
    }
}
