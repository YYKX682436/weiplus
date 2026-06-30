package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.CDNDnsPortInfo */
/* loaded from: classes2.dex */
public class C4467x1e4582cb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb f18520xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb();

    /* renamed from: PortCount */
    private int f18521xb86210ee;

    /* renamed from: PortList */
    private java.util.LinkedList<java.lang.Integer> f18522x2f40f8df = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f18523xcb94b041 = new boolean[3];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb m38388xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb m38389x7c90cfc0() {
        return f18520xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb m38390x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb();
    }

    /* renamed from: addAllElementPortList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb m38391xa80eb27b(java.util.Collection<java.lang.Integer> collection) {
        this.f18522x2f40f8df.addAll(collection);
        this.f18523xcb94b041[2] = true;
        return this;
    }

    /* renamed from: addElementPortList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb m38392x10b224fa(int i17) {
        this.f18522x2f40f8df.add(java.lang.Integer.valueOf(i17));
        this.f18523xcb94b041[2] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb m38393x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb c4467x1e4582cb = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18521xb86210ee), java.lang.Integer.valueOf(c4467x1e4582cb.f18521xb86210ee)) && n51.f.a(this.f18522x2f40f8df, c4467x1e4582cb.f18522x2f40f8df);
    }

    /* renamed from: getPortCount */
    public int m38394x405d6258() {
        return this.f18521xb86210ee;
    }

    /* renamed from: getPortList */
    public java.util.LinkedList<java.lang.Integer> m38395xa740d235() {
        return this.f18522x2f40f8df;
    }

    /* renamed from: hasFieldNumber */
    public boolean m38396x6e095e9(int i17) {
        return this.f18523xcb94b041[i17];
    }

    /* renamed from: hasPortCount */
    public boolean m38397x32cb94() {
        return m38396x6e095e9(1);
    }

    /* renamed from: hasPortList */
    public boolean m38398xd6bb5179() {
        return m38396x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb m38399x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18523xcb94b041[1]) {
                fVar.e(1, this.f18521xb86210ee);
            }
            fVar.g(2, 2, this.f18522x2f40f8df);
            return 0;
        }
        if (i17 == 1) {
            return (this.f18523xcb94b041[1] ? 0 + b36.f.e(1, this.f18521xb86210ee) : 0) + b36.f.g(2, 2, this.f18522x2f40f8df);
        }
        if (i17 == 2) {
            this.f18522x2f40f8df.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f18521xb86210ee = aVar2.g(intValue);
            this.f18523xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f18522x2f40f8df.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        this.f18523xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setPortCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb m38401x9cb122cc(int i17) {
        this.f18521xb86210ee = i17;
        this.f18523xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setPortList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb m38402xa1f93341(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.f18522x2f40f8df = linkedList;
        this.f18523xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb m38400x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb) super.mo11468x92b714fd(bArr);
    }
}
