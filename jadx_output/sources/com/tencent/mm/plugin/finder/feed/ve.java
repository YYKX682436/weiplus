package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ve extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f110897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.el4 f110898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(com.tencent.mm.plugin.finder.feed.af afVar, r45.el4 el4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110897d = afVar;
        this.f110898e = el4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ve(this.f110897d, this.f110898e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.ve veVar = (com.tencent.mm.plugin.finder.feed.ve) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        veVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r8)
            float r8 = com.tencent.mm.plugin.finder.feed.af.B1
            com.tencent.mm.plugin.finder.feed.af r8 = r7.f110897d
            java.lang.String r0 = "2"
            java.lang.String r0 = r8.X6(r0)
            java.lang.String r1 = r8.f106255d
            java.lang.String r2 = "#shareToSNS finally share url = "
            java.lang.String r2 = r2.concat(r0)
            com.tencent.mars.xlog.Log.i(r1, r2)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r45.el4 r2 = r7.f110898e
            r3 = 3
            java.lang.String r4 = r2.getString(r3)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L37
            int r4 = r4.length()
            if (r4 <= 0) goto L32
            r4 = r5
            goto L33
        L32:
            r4 = r6
        L33:
            if (r4 != r5) goto L37
            r4 = r5
            goto L38
        L37:
            r4 = r6
        L38:
            if (r4 == 0) goto L43
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r4 = "Ksnsupload_imgurl"
            r1.putExtra(r4, r3)
        L43:
            java.lang.String r3 = "Ksnsupload_link"
            r1.putExtra(r3, r0)
            java.lang.String r0 = r2.getString(r6)
            java.lang.String r2 = "Ksnsupload_title"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "Ksnsupload_type"
            r1.putExtra(r0, r5)
            android.app.Activity r8 = r8.getContext()
            r0 = 0
            java.lang.String r2 = "sns"
            java.lang.String r3 = ".ui.SnsUploadUI"
            j45.l.j(r8, r2, r3, r1, r0)
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ve.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
