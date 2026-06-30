package c61;

/* loaded from: classes7.dex */
public final class qa extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f120802d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f120803e;

    public qa() {
        this(false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public int op(int i17, java.lang.Object... objs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objs, "objs");
        if (i17 == 0) {
            java.lang.Object obj = objs[0];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type net.jarlehansen.protobuf.output.OutputWriter");
            g36.f fVar = (g36.f) obj;
            fVar.i(1, this.f76492x92037252.mo75928xcd1e8d8());
            this.f76492x92037252.mo75956x3d5d1f78(fVar);
        } else {
            if (i17 == 1) {
                r45.ie ieVar = this.f76492x92037252;
                return (ieVar != null ? 0 + b36.f.i(1, ieVar.mo75928xcd1e8d8()) : 0) + this.f120803e.length;
            }
            if (i17 == 2) {
                java.lang.Object obj2 = objs[0];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(unknownTagHandler, "unknownTagHandler");
                c36.a aVar = new c36.a((byte[]) obj2, unknownTagHandler);
                int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar);
                if (m75958x5767edba == 1 && !super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
                return 0;
            }
            if (i17 == 3) {
                java.lang.Object obj3 = objs[0];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type net.jarlehansen.protobuf.input.InputReader");
                c36.a aVar2 = (c36.a) obj3;
                java.lang.Object obj4 = objs[1];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ResponseProtoBuf");
                r45.js5 js5Var = (r45.js5) obj4;
                java.lang.Object obj5 = objs[2];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) obj5).intValue();
                if (intValue == 1) {
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        java.lang.Object obj6 = j17.get(i18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj6, "get(...)");
                        byte[] bArr = (byte[]) obj6;
                        r45.ie ieVar2 = new r45.ie();
                        if (!(bArr.length == 0)) {
                            ieVar2.mo11468x92b714fd(bArr);
                        }
                        js5Var.f76492x92037252 = ieVar2;
                    }
                }
                return 0;
            }
        }
        return super.op(i17, java.util.Arrays.copyOf(objs, objs.length));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        this.f120803e = bArr == null ? new byte[0] : bArr;
        if (this.f120802d) {
            op(2, bArr);
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toByteArray */
    public byte[] mo14344x5f01b1f6() {
        int i17;
        mo75964xab491916();
        byte[] bArr = new byte[mo75928xcd1e8d8()];
        g36.f fVar = new g36.f(bArr);
        r45.ie ieVar = this.f76492x92037252;
        if (ieVar != null) {
            fVar.i(1, ieVar.mo75928xcd1e8d8());
            this.f76492x92037252.mo75956x3d5d1f78(fVar);
            i17 = b36.f.i(1, this.f76492x92037252.mo75928xcd1e8d8());
        } else {
            i17 = 0;
        }
        byte[] bArr2 = this.f120803e;
        java.lang.System.arraycopy(bArr2, 0, bArr, i17, bArr2.length);
        return bArr;
    }

    public qa(boolean z17) {
        this.f120802d = z17;
        this.f120803e = new byte[0];
        this.f76492x92037252 = new r45.ie();
    }

    public /* synthetic */ qa(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }
}
