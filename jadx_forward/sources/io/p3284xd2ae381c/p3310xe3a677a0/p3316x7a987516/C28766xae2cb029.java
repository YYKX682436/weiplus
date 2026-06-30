package io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516;

/* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin */
/* loaded from: classes13.dex */
public class C28766xae2cb029 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.PathProviderApi {
    static final java.lang.String TAG = "PathProviderPlugin";

    /* renamed from: context */
    private android.content.Context f71967x38b735af;

    /* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory */
        static final /* synthetic */ int[] f71968x64ce01e6;

        static {
            int[] iArr = new int[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.m138904xcee59d22().length];
            f71968x64ce01e6 = iArr;
            try {
                iArr[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.ROOT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f71968x64ce01e6[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.MUSIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f71968x64ce01e6[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.PODCASTS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f71968x64ce01e6[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.RINGTONES.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f71968x64ce01e6[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.ALARMS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f71968x64ce01e6[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.NOTIFICATIONS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f71968x64ce01e6[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.PICTURES.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f71968x64ce01e6[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.MOVIES.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f71968x64ce01e6[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.DOWNLOADS.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f71968x64ce01e6[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.DCIM.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f71968x64ce01e6[io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory.DOCUMENTS.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    /* renamed from: getApplicationSupportDirectory */
    private java.lang.String m138905x92c83398() {
        return io.p3284xd2ae381c.p3319x36f002.C28969x6063ab6c.m139413x5010680c(this.f71967x38b735af);
    }

    /* renamed from: getPathProviderApplicationDocumentsDirectory */
    private java.lang.String m138906xc486bbb9() {
        return io.p3284xd2ae381c.p3319x36f002.C28969x6063ab6c.m139412x18650a2d(this.f71967x38b735af);
    }

    /* renamed from: getPathProviderExternalCacheDirectories */
    private java.util.List<java.lang.String> m138907x48be98a0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : this.f71967x38b735af.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: getPathProviderExternalStorageDirectories */
    private java.util.List<java.lang.String> m138908x97210e47(io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory storageDirectory) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : this.f71967x38b735af.getExternalFilesDirs(m138911xa8cd6bd9(storageDirectory))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: getPathProviderStorageDirectory */
    private java.lang.String m138909x17ea6dfe() {
        java.io.File externalFilesDir = this.f71967x38b735af.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* renamed from: getPathProviderTemporaryDirectory */
    private java.lang.String m138910xd5ea5fe8() {
        return this.f71967x38b735af.getCacheDir().getPath();
    }

    /* renamed from: getStorageDirectoryString */
    private java.lang.String m138911xa8cd6bd9(io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory storageDirectory) {
        switch (io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28766xae2cb029.AnonymousClass1.f71968x64ce01e6[storageDirectory.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new java.lang.RuntimeException("Unrecognized directory: " + storageDirectory);
        }
    }

    /* renamed from: setup */
    private void m138912x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, android.content.Context context) {
        try {
            io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.PathProviderApi.m138893x6843a7d(interfaceC28679x1b8c77f2, this);
        } catch (java.lang.Exception unused) {
        }
        this.f71967x38b735af = context;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.PathProviderApi
    /* renamed from: getApplicationCachePath */
    public java.lang.String mo138894x6641c7cd() {
        return this.f71967x38b735af.getCacheDir().getPath();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.PathProviderApi
    /* renamed from: getApplicationDocumentsPath */
    public java.lang.String mo138895xf751ed03() {
        return m138906xc486bbb9();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.PathProviderApi
    /* renamed from: getApplicationSupportPath */
    public java.lang.String mo138896x5378801a() {
        return m138905x92c83398();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.PathProviderApi
    /* renamed from: getExternalCachePaths */
    public java.util.List<java.lang.String> mo138897x5dc182ad() {
        return m138907x48be98a0();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.PathProviderApi
    /* renamed from: getExternalStoragePath */
    public java.lang.String mo138898x1ffcc93f() {
        return m138909x17ea6dfe();
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.PathProviderApi
    /* renamed from: getExternalStoragePaths */
    public java.util.List<java.lang.String> mo138899xdf9c5f14(io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.StorageDirectory storageDirectory) {
        return m138908x97210e47(storageDirectory);
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.PathProviderApi
    /* renamed from: getTemporaryPath */
    public java.lang.String mo138900x7fdc8260() {
        return m138910xd5ea5fe8();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        m138912x6843a7d(flutterPluginBinding.m137983x3b5b91dc(), flutterPluginBinding.m137982x6e669035());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3316x7a987516.C28758xe84f656c.PathProviderApi.m138893x6843a7d(flutterPluginBinding.m137983x3b5b91dc(), null);
    }
}
