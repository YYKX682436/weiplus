package zh5;

@j95.b
/* loaded from: classes11.dex */
public final class l0 extends i95.w implements e60.d1 {
    public java.lang.String wi(e60.v0 fileInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileInfo, "fileInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("cdn://" + fileInfo.f331278a);
        sb6.append("?");
        e60.s0 s0Var = fileInfo.f331281d;
        if (s0Var != null) {
            sb6.append("field_totalLen=" + s0Var.f331258a + '&');
            sb6.append("field_aesKey=" + s0Var.f331260c + '&');
            sb6.append("field_fileId=" + s0Var.f331259b + '&');
            sb6.append("field_authKey=" + s0Var.f331260c + '&');
            sb6.append("download_url=" + s0Var.f331262e + '&');
            sb6.append("field_filemd5=" + s0Var.f331263f + '&');
        }
        sb6.append("thumb_path=" + fileInfo.f331279b + '&');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("duration_ms=");
        sb7.append(fileInfo.f331280c * 1000);
        sb6.append(sb7.toString());
        return sb6.toString();
    }
}
