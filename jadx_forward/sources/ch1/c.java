package ch1;

/* loaded from: classes7.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f122810a = {1088};

    public void b(long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, j18, j19);
    }

    public void c(long j17, long j18, long j19, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
        long[] jArr = this.f122810a;
        int length = jArr.length;
        boolean z18 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            if (jArr[i17] == j17) {
                z18 = true;
                break;
            }
            i17++;
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.j(null, 0, 0, j17, j18, j19);
        }
    }
}
