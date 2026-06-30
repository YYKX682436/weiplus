package tb;

/* loaded from: classes13.dex */
public class d extends sb.e {
    public d(com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4742x2925229b c4742x2925229b) {
        java.lang.String str;
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(c4742x2925229b.f20216xa155f18) || android.text.TextUtils.isEmpty(c4742x2925229b.f20217x23ff81a5)) {
            str = "wechat-channels.logdata.qq.com";
            str2 = "/v1/r/report/log_data";
        } else {
            str = c4742x2925229b.f20216xa155f18;
            str2 = c4742x2925229b.f20217x23ff81a5;
        }
        sb.b bVar = this.f486922d;
        bVar.f486921j = 1;
        bVar.f486914c = str;
        bVar.f486916e = str2;
        bVar.f486919h = bVar.f486912a + sb.h.a(str, "") + bVar.f486916e;
    }
}
