package r45;

/* loaded from: classes4.dex */
public class ns extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463167d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f463168e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ns)) {
            return false;
        }
        r45.ns nsVar = (r45.ns) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463167d), java.lang.Integer.valueOf(nsVar.f463167d)) && n51.f.a(this.f463168e, nsVar.f463168e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463167d);
            fVar.k(2, 2, this.f463168e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f463167d) + 0 + b36.f.k(2, 2, this.f463168e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f463168e.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ns nsVar = (r45.ns) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nsVar.f463167d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        byte[] bArr2 = aVar2.d(intValue).f273689a;
        d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
        e36.a aVar3 = new e36.a(bArr2, 0, bArr2.length);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (aVar3.f329129c < aVar3.f329128b) {
            linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
        }
        nsVar.f463168e = linkedList;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f463167d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "PortCount", valueOf, false);
            eVar.d(jSONObject, "PortList", this.f463168e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
