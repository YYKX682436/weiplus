package com.p314xaae8f345.p592x631407a.api.p594x414ef28f;

/* renamed from: com.tencent.midas.api.request.APIabResult */
/* loaded from: classes5.dex */
public class C4738x9aafc798 {

    /* renamed from: mMessage */
    java.lang.String f20162xd703b2da;

    /* renamed from: mResponse */
    int f20163x10b4bbce;

    public C4738x9aafc798(int i17, java.lang.String str) {
        this.f20163x10b4bbce = i17;
        if (str == null || str.trim().length() == 0) {
            this.f20162xd703b2da = m41430xb6b410e8(i17);
            return;
        }
        this.f20162xd703b2da = str + " (response: " + m41430xb6b410e8(i17) + ")";
    }

    /* renamed from: getResponseDesc */
    public static java.lang.String m41430xb6b410e8(int i17) {
        return "";
    }

    /* renamed from: getMessage */
    public java.lang.String m41431x76b83bd1() {
        return this.f20162xd703b2da;
    }

    /* renamed from: getResponse */
    public int m41432x679151b7() {
        return this.f20163x10b4bbce;
    }

    /* renamed from: isFailure */
    public boolean m41433x9cad7900() {
        return !m41435x6e268779();
    }

    /* renamed from: isPendig */
    public boolean m41434xed0e8293() {
        return this.f20163x10b4bbce == 101;
    }

    /* renamed from: isSuccess */
    public boolean m41435x6e268779() {
        return this.f20163x10b4bbce == 0;
    }

    /* renamed from: toString */
    public java.lang.String m41436x9616526c() {
        return "IabResult: " + m41431x76b83bd1();
    }
}
