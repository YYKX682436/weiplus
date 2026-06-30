package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzaaz */
/* loaded from: classes13.dex */
public final class C2143x6f0211a extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119 {
    public C2143x6f0211a(int i17) {
        super(i17, null);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119
    /* renamed from: zzrg */
    public final void mo18869x394d75() {
        if (!m18867xa56d5b78()) {
            for (int i17 = 0; i17 < m18870x394dd5(); i17++) {
                java.util.Map.Entry m18868x394b67 = m18868x394b67(i17);
                if (((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2401x394e75) m18868x394b67.getKey()).m19402x394db7()) {
                    m18868x394b67.setValue(java.util.Collections.unmodifiableList((java.util.List) m18868x394b67.getValue()));
                }
            }
            for (java.util.Map.Entry entry : m18871x394dd6()) {
                if (((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2401x394e75) entry.getKey()).m19402x394db7()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.mo18869x394d75();
    }
}
