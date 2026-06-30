package bw5;

/* loaded from: classes9.dex */
public enum x9 implements com.tencent.mm.protobuf.h {
    EcsWordDecryptType_Default(0),
    EcsWordDecryptType_Username_2_Nickname(1),
    EcsWordDecryptType_String_Decrypt(2),
    EcsWordDecryptType_String_Encrypt(3),
    EcsWordDecryptType_EncryptedUsername_2_Nickname(4),
    EcsWordDecryptType_EncryptedUsername_2_NicknameAndStatus(5),
    EcsWordDecryptType_EncryptedUsername_2_Nickname_InGroup(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f35014d;

    x9(int i17) {
        this.f35014d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f35014d;
    }
}
