package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KContactService {
    void attachAvatar(java.lang.String str, com.tencent.kinda.gen.KImageView kImageView);

    com.tencent.kinda.gen.KContact get(java.lang.String str);

    long getCryptUin();

    java.lang.String getUserName();

    boolean isEuropeRegUser();
}
