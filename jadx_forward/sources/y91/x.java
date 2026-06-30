package y91;

/* loaded from: classes16.dex */
public class x {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f541852h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final y91.y f541853a;

    /* renamed from: b, reason: collision with root package name */
    public y91.i0 f541854b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f541855c;

    /* renamed from: d, reason: collision with root package name */
    public java.net.InetSocketAddress f541856d;

    /* renamed from: e, reason: collision with root package name */
    public java.net.MulticastSocket f541857e;

    /* renamed from: f, reason: collision with root package name */
    public java.net.MulticastSocket f541858f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f541859g = false;

    public x(y91.y yVar, java.util.List list, y91.i0 i0Var, int i17) {
        this.f541853a = yVar;
        this.f541854b = i0Var;
        this.f541855c = list;
        try {
            java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket(i17);
            this.f541857e = multicastSocket;
            multicastSocket.setReuseAddress(true);
            this.f541857e.setReceiveBufferSize(32768);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Creating wildcard socketNotify (for receiving multicast datagrams) on port: ");
            int i18 = yVar.f541861b;
            sb6.append(i18);
            v91.b.b("x", sb6.toString());
            this.f541856d = new java.net.InetSocketAddress(yVar.f541860a, i18);
            java.net.MulticastSocket multicastSocket2 = new java.net.MulticastSocket(i18);
            this.f541858f = multicastSocket2;
            multicastSocket2.setReuseAddress(true);
            this.f541858f.setReceiveBufferSize(32768);
            for (java.net.NetworkInterface networkInterface : this.f541855c) {
                v91.b.b("x", "Joining multicast group: " + this.f541856d + " on network interface: " + networkInterface.getDisplayName());
                this.f541858f.joinGroup(this.f541856d, networkInterface);
            }
        } catch (java.lang.Exception e17) {
            throw new java.lang.Exception("Could not initialize x: " + e17);
        }
    }

    public static void a(y91.x xVar) {
        v91.b.b("x", "Entering blocking search receiving loop, listening for UDP datagrams on port: " + xVar.f541857e.getLocalPort());
        y91.l0 l0Var = new y91.l0();
        while (xVar.f541859g) {
            try {
                int i17 = xVar.f541853a.f541862c;
                java.net.DatagramPacket datagramPacket = new java.net.DatagramPacket(new byte[i17], i17);
                xVar.f541857e.receive(datagramPacket);
                java.lang.String str = new java.lang.String(datagramPacket.getData(), 0, datagramPacket.getLength(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                v91.b.b("x", "loopSearch: content = " + str);
                aa1.b c17 = l0Var.c(str);
                if (c17 != null) {
                    xVar.f541854b.e(c17);
                } else {
                    v91.b.a("x", "discard this message");
                }
            } catch (java.io.IOException e17) {
                v91.b.a("x", "search fail: " + android.util.Log.getStackTraceString(e17));
                xVar.f541859g = false;
                throw e17;
            }
        }
        v91.b.a("x", "loop end");
    }

    public static void b(y91.x xVar) {
        v91.b.b("x", "Entering blocking notify receiving loop, listening for UDP datagrams on port: " + xVar.f541858f.getLocalPort());
        y91.l0 l0Var = new y91.l0();
        while (xVar.f541859g) {
            try {
                int i17 = xVar.f541853a.f541862c;
                java.net.DatagramPacket datagramPacket = new java.net.DatagramPacket(new byte[i17], i17);
                xVar.f541858f.receive(datagramPacket);
                java.lang.String str = new java.lang.String(datagramPacket.getData(), 0, datagramPacket.getLength(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                v91.b.b("x", str);
                aa1.b c17 = l0Var.c(str);
                if (c17 != null) {
                    xVar.f541854b.e(c17);
                } else {
                    v91.b.b("x", "receive a not care notify message");
                }
            } catch (java.io.IOException e17) {
                v91.b.a("x", "notify fail: " + android.util.Log.getStackTraceString(e17));
                xVar.f541859g = false;
                throw e17;
            }
        }
        v91.b.a("x", "loop end");
    }

    public synchronized void c() {
        if (this.f541859g) {
            return;
        }
        this.f541859g = true;
        new java.lang.Thread(new y91.w(this, null)).start();
        new java.lang.Thread(new y91.v(this, null)).start();
    }
}
