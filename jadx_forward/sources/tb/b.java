package tb;

/* loaded from: classes13.dex */
public class b extends sb.e {
    public b() {
        java.lang.String m41851xe17c3861 = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41851xe17c3861();
        if (android.text.TextUtils.isEmpty(m41851xe17c3861)) {
            return;
        }
        java.lang.String format = java.lang.String.format("/cgi-bin/log_data.fcg?offer_id=%s", m41851xe17c3861);
        java.lang.String format2 = java.lang.String.format("/cgi-bin/log_data.fcg?offer_id=%s", m41851xe17c3861);
        java.lang.String format3 = java.lang.String.format("/cgi-bin/log_data.fcg?offer_id=%s", m41851xe17c3861);
        sb.b bVar = this.f486922d;
        bVar.getClass();
        java.lang.String str = com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.env;
        if (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20438x62193627) {
            bVar.f486915d = com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4754xfbd52878.m41597x160af7ba(str);
            bVar.f486916e = format3;
        } else if (str.equals(com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20061xcc101583)) {
            bVar.f486915d = "dev.api.unipay.qq.com";
            bVar.f486916e = format;
        } else if (str.equals("test")) {
            bVar.f486915d = "sandbox.api.unipay.qq.com";
            bVar.f486916e = format2;
        } else if (str.equals("release")) {
            bVar.f486915d = "szmg.qq.com";
            bVar.f486916e = format3;
        } else if (str.equals(com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20064xc194547e)) {
            bVar.f486915d = "szmg.qq.com";
            bVar.f486916e = format3;
        }
        bVar.f486921j = 1;
        bVar.f486914c = bVar.f486915d;
        if (str.equals(com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20061xcc101583)) {
            bVar.f486919h = bVar.f486912a + sb.h.a(bVar.f486915d, "") + bVar.f486916e;
            return;
        }
        if (str.equals("test")) {
            bVar.f486919h = bVar.f486912a + sb.h.a(bVar.f486915d, "") + bVar.f486916e;
            return;
        }
        if (str.equals("release")) {
            bVar.f486919h = bVar.f486912a + sb.h.a(bVar.f486915d, "") + bVar.f486916e;
            return;
        }
        if (str.equals(com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20064xc194547e)) {
            bVar.f486919h = bVar.f486912a + sb.h.a(bVar.f486915d, "") + bVar.f486916e;
        }
    }
}
