package com.tencent.mm.opensdk.modelbiz;

/* loaded from: classes9.dex */
public interface IWXChannelJumpInfo {
    public static final int WX_CHANNEL_JUMP_TYPE_MINI_PROGRAM = 1;
    public static final int WX_CHANNEL_JUMP_TYPE_UNKNOWN = 0;
    public static final int WX_CHANNEL_JUMP_TYPE_URL = 2;

    boolean checkArgs();

    void serialize(android.os.Bundle bundle);

    int type();

    void unserialize(android.os.Bundle bundle);
}
