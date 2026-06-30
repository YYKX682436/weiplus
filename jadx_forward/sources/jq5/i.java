package jq5;

/* loaded from: classes5.dex */
public final class i implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jq5.m f382805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f382806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f382807c;

    public i(jq5.m mVar, p3325xe03a0797.p3326xc267989b.q qVar, android.content.Context context) {
        this.f382805a = mVar;
        this.f382806b = qVar;
        this.f382807c = context;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iArr);
        int length = iArr.length;
        boolean z17 = false;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                break;
            }
            if (iArr[i18] != 0) {
                z17 = true;
                break;
            }
            i18++;
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f382806b;
        jq5.m mVar = this.f382805a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.WeDropPermissionManager", "[handlePermissionResult] permission=" + mVar.f382812a + " granted");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeDrop.WeDropPermissionManager", "[handlePermissionResult] permission=" + mVar.f382812a + " not granted");
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        jq5.l.a(jq5.n.f382815a, this.f382807c, mVar);
    }
}
