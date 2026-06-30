package bg3;

/* loaded from: classes3.dex */
public class e extends lf3.n implements bg3.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    @Override // bg3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S2(mf3.k r9) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg3.e.S2(mf3.k):void");
    }

    public final java.lang.String V6(java.lang.String str) {
        java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
            java.lang.String a17 = q75.g.a(q75.g.d(str));
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, n17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DefaultSaveComponent", "ext (" + n17 + ") not match meta: $(" + a17 + ')');
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(com.p314xaae8f345.mm.vfs.w6.r(str));
                sb6.append("/save_temp_");
                sb6.append(java.lang.System.currentTimeMillis());
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.mm.vfs.w6.c(str, sb7);
                return sb7;
            }
        }
        return str;
    }

    public void W6(mf3.k mediaInfo, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
    }
}
