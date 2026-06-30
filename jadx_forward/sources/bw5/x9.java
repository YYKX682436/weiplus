package bw5;

/* loaded from: classes9.dex */
public enum x9 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    EcsWordDecryptType_Default(0),
    EcsWordDecryptType_Username_2_Nickname(1),
    EcsWordDecryptType_String_Decrypt(2),
    EcsWordDecryptType_String_Encrypt(3),
    EcsWordDecryptType_EncryptedUsername_2_Nickname(4),
    EcsWordDecryptType_EncryptedUsername_2_NicknameAndStatus(5),
    EcsWordDecryptType_EncryptedUsername_2_Nickname_InGroup(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f116547d;

    x9(int i17) {
        this.f116547d = i17;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f116547d;
    }
}
