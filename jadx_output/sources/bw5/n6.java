package bw5;

/* loaded from: classes9.dex */
public class n6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.x9 f30503d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30504e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30505f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30506g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f30507h = new boolean[5];

    static {
        new bw5.n6();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n6 parseFrom(byte[] bArr) {
        return (bw5.n6) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n6)) {
            return false;
        }
        bw5.n6 n6Var = (bw5.n6) fVar;
        return n51.f.a(this.f30503d, n6Var.f30503d) && n51.f.a(this.f30504e, n6Var.f30504e) && n51.f.a(this.f30505f, n6Var.f30505f) && n51.f.a(this.f30506g, n6Var.f30506g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.x9 x9Var;
        int i18 = 0;
        boolean[] zArr = this.f30507h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.x9 x9Var2 = this.f30503d;
            if (x9Var2 != null && zArr[1]) {
                fVar.e(1, x9Var2.f35014d);
            }
            java.lang.String str = this.f30504e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f30505f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f30506g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.x9 x9Var3 = this.f30503d;
            if (x9Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, x9Var3.f35014d);
            }
            java.lang.String str4 = this.f30504e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f30505f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f30506g;
            return (str6 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str6);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f30504e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f30505f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f30506g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        switch (aVar2.g(intValue)) {
            case 0:
                x9Var = bw5.x9.EcsWordDecryptType_Default;
                break;
            case 1:
                x9Var = bw5.x9.EcsWordDecryptType_Username_2_Nickname;
                break;
            case 2:
                x9Var = bw5.x9.EcsWordDecryptType_String_Decrypt;
                break;
            case 3:
                x9Var = bw5.x9.EcsWordDecryptType_String_Encrypt;
                break;
            case 4:
                x9Var = bw5.x9.EcsWordDecryptType_EncryptedUsername_2_Nickname;
                break;
            case 5:
                x9Var = bw5.x9.EcsWordDecryptType_EncryptedUsername_2_NicknameAndStatus;
                break;
            case 6:
                x9Var = bw5.x9.EcsWordDecryptType_EncryptedUsername_2_Nickname_InGroup;
                break;
            default:
                x9Var = null;
                break;
        }
        this.f30503d = x9Var;
        zArr[1] = true;
        return 0;
    }
}
