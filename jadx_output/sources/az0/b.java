package az0;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15337d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.b(this.f15337d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transcode file ");
        java.lang.String str = this.f15337d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.HeicTranscodeHelper", sb6.toString());
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(az0.c.f15372a);
        sb7.append('/');
        java.lang.String str3 = a17.f213279f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        java.lang.String str4 = str3;
        kotlin.jvm.internal.o.f(str4, "getName(...)");
        java.lang.String str5 = (java.lang.String) kz5.n0.a0(r26.n0.f0(str4, new java.lang.String[]{"."}, false, 0, 6, null), 0);
        if (str5 == null) {
            str5 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        sb7.append(str5);
        sb7.append("_transcoded.jpg");
        java.lang.String sb8 = sb7.toString();
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(sb8);
        java.lang.String str6 = a18.f213279f;
        if (str6 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str6, false, false);
            if (!str6.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        java.lang.Object obj2 = null;
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.HeicTranscodeHelper", str + " has cache " + sb8);
            return sb8;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.HeicTranscodeHelper", "start transcode for file " + str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.graphics.Bitmap t17 = com.tencent.mm.sdk.platformtools.x.t(str, 4096, 4096, true, false);
        if (t17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Maas.HeicTranscodeHelper", "decode bitmap error " + str);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.HeicTranscodeHelper", "decode success, start encode " + str + ", takes " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.sdk.platformtools.x.D0(t17, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb8, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.HeicTranscodeHelper", "encode success " + str + ", takes " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            m521constructorimpl = kotlin.Result.m521constructorimpl(sb8);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl == null) {
            obj2 = m521constructorimpl;
        } else {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Maas.HeicTranscodeHelper", m524exceptionOrNullimpl, "save bitmap error " + str, new java.lang.Object[0]);
        }
        return (java.lang.String) obj2;
    }
}
