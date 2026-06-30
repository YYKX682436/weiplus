package cl;

/* loaded from: classes7.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f124201a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p159x477cd522.p160x333422.C1481x17e6a5e9 f124202b;

    public j3(java.lang.String str, java.lang.String str2) {
        this(str, str2, "", "");
    }

    public boolean a() {
        com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e9 = this.f124202b;
        if (c1481x17e6a5e9 == null) {
            return false;
        }
        return (3 == c1481x17e6a5e9.f4815xcdd276a5 && android.text.TextUtils.isEmpty(c1481x17e6a5e9.f4814xcdd22c98)) ? false : true;
    }

    public j3(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f124201a = str;
        com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e9 = new com.p159x477cd522.p160x333422.C1481x17e6a5e9();
        this.f124202b = c1481x17e6a5e9;
        c1481x17e6a5e9.f4815xcdd276a5 = 3;
        c1481x17e6a5e9.f4814xcdd22c98 = str2;
        c1481x17e6a5e9.f4808x7f1f2ea0 = str3;
        c1481x17e6a5e9.f4809xe6292f7d = str4;
    }

    public j3(java.lang.String str, com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e9) {
        this.f124201a = str;
        this.f124202b = c1481x17e6a5e9;
    }
}
