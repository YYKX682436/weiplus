package qe5;

/* loaded from: classes12.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f443667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(qe5.n1 n1Var) {
        super(1);
        this.f443667d = n1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(61:20|(1:22)|23|(1:25)|26|(1:28)|29|(1:31)(2:295|(56:297|(1:299)(1:316)|300|(1:315)(1:304)|(1:314)(1:307)|(1:313)|33|(2:35|(1:37))|38|(1:40)(1:294)|(2:42|(1:44))|45|46|47|48|49|50|51|52|53|54|55|56|57|(1:59)(1:281)|60|(1:62)(1:280)|63|(1:65)(1:279)|66|(3:68|(4:70|(1:74)(1:272)|(4:76|(1:78)|79|(2:81|(1:83)(1:266))(1:267))(1:268)|84)(3:273|(1:275)(1:277)|276)|85)(1:278)|(1:87)|88|(1:265)(1:92)|(2:94|(1:96))(3:261|(1:263)|264)|97|98|(1:100)(1:257)|101|102|103|104|(1:106)(1:253)|(3:108|(1:146)(1:112)|(13:114|(1:116)(1:145)|117|(1:119)(1:144)|120|(1:122)(1:143)|(2:126|(1:128))|129|(3:133|(1:135)|136)|137|(1:139)|140|(1:142)))|147|(1:149)(1:252)|(1:251)(1:153)|154|(1:156)(1:250)|(1:158)(2:159|(2:161|(1:163))(10:164|(1:166)(1:249)|(1:171)|172|(1:174)(1:248)|(3:178|(1:180)(1:182)|181)|183|(1:185)(1:247)|186|(3:190|(1:192)(1:194)|193)(6:(1:198)(1:246)|(1:203)(1:242)|(1:208)(1:241)|(1:213)(1:240)|(1:218)(1:239)|(2:220|(1:222))(1:(2:(1:227)(1:229)|228)(2:230|(3:234|(1:236)(1:238)|237))))))|129|(4:131|133|(0)|136)|137|(0)|140|(0)))|32|33|(0)|38|(0)(0)|(0)|45|46|47|48|49|50|51|52|53|54|55|56|57|(0)(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|(0)|88|(1:90)|265|(0)(0)|97|98|(0)(0)|101|102|103|104|(0)(0)|(0)|147|(0)(0)|(1:151)|251|154|(0)(0)|(0)(0)|129|(0)|137|(0)|140|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0501, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0502, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePageLogicUIC", "initPreview: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04da, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04db, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.File.FilePageLogicUIC", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0327, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0328, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePageLogicUIC", "initOpenBtn: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x02d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x02d3, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewUIC", "initFilePreviewBtn: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x023b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x023c, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePageLogicUIC", "initFileDownloadBtn: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0205, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0206, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePageLogicUIC", "initContinueBtn: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04d5 A[Catch: Exception -> 0x04da, TRY_LEAVE, TryCatch #1 {Exception -> 0x04da, blocks: (B:98:0x04c6, B:257:0x04d5), top: B:97:0x04c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0473  */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 2334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.k1.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
