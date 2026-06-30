package dl3;

/* loaded from: classes13.dex */
public class e extends ql.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 f316837a;

    /* renamed from: b, reason: collision with root package name */
    public final n01.b f316838b;

    public e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 interfaceC25396xa9fd0b61, n01.b bVar) {
        this.f316837a = interfaceC25396xa9fd0b61;
        this.f316838b = bVar;
    }

    @Override // ql.c
    public void a() {
        java.net.URL url;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 interfaceC25396xa9fd0b61 = this.f316837a;
        if (interfaceC25396xa9fd0b61 != null) {
            try {
                url = new java.net.URL(this.f316838b.f415370b);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.AudioHttpDownloadSource", e17, "connect", new java.lang.Object[0]);
                url = null;
            }
            interfaceC25396xa9fd0b61.mo94091x38b478ea(url, new java.util.HashMap());
        }
    }

    @Override // ql.c
    public n01.b b() {
        return this.f316838b;
    }

    @Override // ql.c
    public java.lang.String c() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 interfaceC25396xa9fd0b61 = this.f316837a;
        if (interfaceC25396xa9fd0b61 != null) {
            return interfaceC25396xa9fd0b61.mo94093x53babee4();
        }
        return null;
    }

    @Override // ql.c
    /* renamed from: disconnect */
    public void mo124757x1f9d589c() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 interfaceC25396xa9fd0b61 = this.f316837a;
        if (interfaceC25396xa9fd0b61 != null) {
            interfaceC25396xa9fd0b61.mo94092x1f9d589c();
        }
    }

    @Override // ql.c
    /* renamed from: getSize */
    public long mo124758xfb854877() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 interfaceC25396xa9fd0b61 = this.f316837a;
        if (interfaceC25396xa9fd0b61 != null) {
            return interfaceC25396xa9fd0b61.mo94094xfb854877();
        }
        return -1L;
    }

    @Override // ql.c
    /* renamed from: readAt */
    public int mo124759xc8455469(long j17, byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 interfaceC25396xa9fd0b61 = this.f316837a;
        if (interfaceC25396xa9fd0b61 != null) {
            return interfaceC25396xa9fd0b61.mo94096xc8455469(j17, bArr, i17, i18);
        }
        return -1;
    }
}
