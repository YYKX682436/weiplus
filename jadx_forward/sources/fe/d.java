package fe;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f342882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe.g f342883e;

    public d(fe.g gVar, long j17) {
        this.f342883e = gVar;
        this.f342882d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f342882d <= 0) {
            return;
        }
        synchronized (this.f342883e.f342895j) {
            long j17 = this.f342882d;
            if (j17 < 5120) {
                if (this.f342883e.f342895j.a(0)) {
                    fe.f fVar = this.f342883e.f342895j;
                    fVar.put(0, fVar.get(0) + 1);
                } else {
                    this.f342883e.f342895j.put(0, 1);
                }
            } else if (j17 < 10240) {
                if (this.f342883e.f342895j.a(1)) {
                    fe.f fVar2 = this.f342883e.f342895j;
                    fVar2.put(1, fVar2.get(1) + 1);
                } else {
                    this.f342883e.f342895j.put(1, 1);
                }
            } else if (j17 < 20480) {
                if (this.f342883e.f342895j.a(2)) {
                    fe.f fVar3 = this.f342883e.f342895j;
                    fVar3.put(2, fVar3.get(2) + 1);
                } else {
                    this.f342883e.f342895j.put(2, 1);
                }
            } else if (j17 < 51200) {
                if (this.f342883e.f342895j.a(3)) {
                    fe.f fVar4 = this.f342883e.f342895j;
                    fVar4.put(3, fVar4.get(3) + 1);
                } else {
                    this.f342883e.f342895j.put(3, 1);
                }
            } else if (j17 < 102400) {
                if (this.f342883e.f342895j.a(4)) {
                    fe.f fVar5 = this.f342883e.f342895j;
                    fVar5.put(4, fVar5.get(4) + 1);
                } else {
                    this.f342883e.f342895j.put(4, 1);
                }
            } else if (j17 < 153600) {
                if (this.f342883e.f342895j.a(5)) {
                    fe.f fVar6 = this.f342883e.f342895j;
                    fVar6.put(5, fVar6.get(5) + 1);
                } else {
                    this.f342883e.f342895j.put(5, 1);
                }
            } else if (j17 < 204800) {
                if (this.f342883e.f342895j.a(6)) {
                    fe.f fVar7 = this.f342883e.f342895j;
                    fVar7.put(6, fVar7.get(6) + 1);
                } else {
                    this.f342883e.f342895j.put(6, 1);
                }
            } else if (j17 < 512000) {
                if (this.f342883e.f342895j.a(7)) {
                    fe.f fVar8 = this.f342883e.f342895j;
                    fVar8.put(7, fVar8.get(7) + 1);
                } else {
                    this.f342883e.f342895j.put(7, 1);
                }
            } else if (j17 < 1048576) {
                if (this.f342883e.f342895j.a(8)) {
                    fe.f fVar9 = this.f342883e.f342895j;
                    fVar9.put(8, fVar9.get(8) + 1);
                } else {
                    this.f342883e.f342895j.put(8, 1);
                }
            } else if (j17 < 2097152) {
                if (this.f342883e.f342895j.a(9)) {
                    fe.f fVar10 = this.f342883e.f342895j;
                    fVar10.put(9, fVar10.get(9) + 1);
                } else {
                    this.f342883e.f342895j.put(9, 1);
                }
            } else if (j17 < 3145728) {
                if (this.f342883e.f342895j.a(10)) {
                    fe.f fVar11 = this.f342883e.f342895j;
                    fVar11.put(10, fVar11.get(10) + 1);
                } else {
                    this.f342883e.f342895j.put(10, 1);
                }
            } else if (this.f342883e.f342895j.a(11)) {
                fe.f fVar12 = this.f342883e.f342895j;
                fVar12.put(11, fVar12.get(11) + 1);
            } else {
                this.f342883e.f342895j.put(11, 1);
            }
        }
    }
}
