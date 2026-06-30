package cw2;

/* loaded from: classes2.dex */
public interface ca {
    static /* synthetic */ void d(cw2.ca caVar, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterSeekMode");
        }
        if ((i17 & 1) != 0) {
            str = "";
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        caVar.f(str, z17);
    }

    void b(float f17);

    void f(java.lang.String str, boolean z17);

    /* renamed from: getCurrentProgress */
    int mo61205x2f082c90();

    /* renamed from: getDragStyle */
    int mo61206xec369227();

    void h(float f17, long j17, long j18);

    boolean i();

    boolean l();

    void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88);

    void o(float f17, int i17, int i18);

    /* renamed from: onVideoEnded */
    void mo61216x653dba3e();

    void p(int i17, int i18);

    boolean r();

    /* renamed from: setProgress */
    void mo61220x3ae760af(int i17);

    /* renamed from: setSeekBarCallback */
    void mo61221xd915471e(cw2.ba baVar);

    /* renamed from: setVisibility */
    void m122862x901b6914(int i17);

    void t(java.lang.String str);
}
