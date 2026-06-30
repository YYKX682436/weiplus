package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.PlayerException */
/* loaded from: classes.dex */
public class C25342xb76fba4e {

    /* renamed from: EXCEPTION_FILE_READ_EMPTY */
    public static final int f45656xdd3593d7 = 100;

    /* renamed from: EXCEPTION_FILE_READ_EMPTY_INTERNAL_STORAGE */
    public static final int f45657x9df23641 = 200;

    /* renamed from: EXCEPTION_IN_BASEMETHOD */
    public static final int f45658x3fc96a3c = 99;

    /* renamed from: EXCEPTION_IN_CHECK_STATE */
    public static final int f45659xd352f050 = 89;

    /* renamed from: EXCEPTION_IN_PAUSE */
    public static final int f45660xcb53804c = 93;

    /* renamed from: EXCEPTION_IN_PREPARE */
    public static final int f45661x609425dd = 91;

    /* renamed from: EXCEPTION_IN_RELEASE */
    public static final int f45662xb48f40dd = 97;

    /* renamed from: EXCEPTION_IN_RESET */
    public static final int f45663xcb7177a5 = 98;

    /* renamed from: EXCEPTION_IN_SEEK */
    public static final int f45664xedca4d42 = 95;

    /* renamed from: EXCEPTION_IN_SETAUDIOEFFECT */
    public static final int f45665x7309a58f = 96;

    /* renamed from: EXCEPTION_IN_SETDATASOURCE */
    public static final int f45666xceab2e7d = 90;

    /* renamed from: EXCEPTION_IN_START */
    public static final int f45667xcb861eb8 = 92;

    /* renamed from: EXCEPTION_IN_STOP */
    public static final int f45668xedca86cc = 94;

    /* renamed from: EXCEPTION_TYPE_CONNECT_FAIL */
    public static final int f45669xf5f69e48 = 80;

    /* renamed from: EXCEPTION_TYPE_CONTINUOUS_WRITE_ZERO */
    public static final int f45670xf5632923 = 105;

    /* renamed from: EXCEPTION_TYPE_CREATAUDIOTRACK */
    public static final int f45671xcc3a769 = 66;

    /* renamed from: EXCEPTION_TYPE_CREATE_BUFFER_FILE */
    public static final int f45672x3f3d986d = 103;

    /* renamed from: EXCEPTION_TYPE_DECODE */
    public static final int f45673x1d9eb683 = 67;

    /* renamed from: EXCEPTION_TYPE_DECODE_EXTERNAL_STORAGE */
    public static final int f45674x8afff023 = 68;

    /* renamed from: EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE */
    public static final int f45675x92fdfc4b = 82;

    /* renamed from: EXCEPTION_TYPE_ERROR_CREATE_NATIVE_DATASOURCE */
    public static final int f45676xbc59b0f6 = 81;

    /* renamed from: EXCEPTION_TYPE_ERROR_FILE */
    public static final int f45677xd5f19b88 = 70;

    /* renamed from: EXCEPTION_TYPE_ERROR_OPEN_JAVA_DATASOURCE */
    public static final int f45678xbe277c99 = 83;

    /* renamed from: EXCEPTION_TYPE_FILECANNOTREAD */
    public static final int f45679x22a0732a = 54;

    /* renamed from: EXCEPTION_TYPE_FILENOTFOUND */
    public static final int f45680x910e06e0 = 53;

    /* renamed from: EXCEPTION_TYPE_GETAUDIOINFO */
    public static final int f45681x15610bc3 = 63;

    /* renamed from: EXCEPTION_TYPE_ILLEGAL_STATE */
    public static final int f45682x3ad06413 = 104;

    /* renamed from: EXCEPTION_TYPE_INITLIB */
    public static final int f45683xae69d160 = 61;

    /* renamed from: EXCEPTION_TYPE_INVALIDAUDIOINFO */
    public static final int f45684x671193c2 = 64;

    /* renamed from: EXCEPTION_TYPE_INVALIDSEEK */
    public static final int f45685xaa68655a = 74;

    /* renamed from: EXCEPTION_TYPE_IO */
    public static final int f45686x459acc3b = 51;

    /* renamed from: EXCEPTION_TYPE_LOADLIB */
    public static final int f45687x4e5959ca = 60;

    /* renamed from: EXCEPTION_TYPE_MALFORMED */
    public static final int f45688x4cdad6e6 = 50;

    /* renamed from: EXCEPTION_TYPE_NATIVEOPEN */
    public static final int f45689x2bc15cf6 = 62;

    /* renamed from: EXCEPTION_TYPE_NULLPOINTER */
    public static final int f45690xcafcfb41 = 52;

    /* renamed from: EXCEPTION_TYPE_RECOGNTION_ERROR */
    public static final int f45691xe3a2f2d8 = 101;

    /* renamed from: EXCEPTION_TYPE_SO_NOT_FOUND */
    public static final int f45692x4d708d88 = 69;

    /* renamed from: EXCEPTION_TYPE_UNKNOWFORMAT */
    public static final int f45693x26bbea70 = 55;

    /* renamed from: EXCEPTION_TYPE_UNKNOWFORMAT_EXTERNAL_STORAGE */
    public static final int f45694x4a9d73d6 = 56;

    /* renamed from: EXCEPTION_TYPE_UNSUPPORTAUDIOINFO */
    public static final int f45695xacc19043 = 65;

    /* renamed from: EXCEPTION_TYPE_WRITE_AUDIOTRACK */
    public static final int f45696xdb4a6a0a = 102;

    /* renamed from: isDecodeError */
    public static boolean m93839xf1a7f130(int i17) {
        return i17 == 67 || i17 == 62 || i17 == 63 || i17 == 64 || i17 == 101 || i17 == 74 || i17 == 55;
    }

    /* renamed from: isIOError */
    public static boolean m93840x1ab05018(int i17) {
        return i17 == 103 || i17 == 53;
    }

    /* renamed from: isNetworkError */
    public static boolean m93841xd006a6c4(int i17) {
        return i17 == 80;
    }

    /* renamed from: isRendererError */
    public static boolean m93842x8e48f9fb(int i17) {
        return i17 == 66 || i17 == 102 || i17 == 54;
    }
}
