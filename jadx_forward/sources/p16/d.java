package p16;

/* loaded from: classes16.dex */
public abstract class d implements p16.j0 {
    static {
        int i17 = p16.l.f432851b;
    }

    public final p16.h0 b(p16.h0 h0Var) {
        if (h0Var == null || h0Var.mo134563xf582434a()) {
            return h0Var;
        }
        p16.z zVar = new p16.z((h0Var instanceof p16.c ? new p16.x0((p16.c) h0Var) : new p16.x0(h0Var)).getMessage());
        zVar.f432904d = h0Var;
        throw zVar;
    }

    public java.lang.Object c(java.io.InputStream inputStream, p16.l lVar) {
        p16.h0 h0Var;
        try {
            int read = inputStream.read();
            if (read == -1) {
                h0Var = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i17 = 7;
                    while (true) {
                        if (i17 >= 32) {
                            while (i17 < 64) {
                                int read2 = inputStream.read();
                                if (read2 == -1) {
                                    throw p16.z.b();
                                }
                                if ((read2 & 128) != 0) {
                                    i17 += 7;
                                }
                            }
                            throw new p16.z("CodedInputStream encountered a malformed varint.");
                        }
                        int read3 = inputStream.read();
                        if (read3 == -1) {
                            throw p16.z.b();
                        }
                        read |= (read3 & 127) << i17;
                        if ((read3 & 128) == 0) {
                            break;
                        }
                        i17 += 7;
                    }
                }
                p16.h hVar = new p16.h(new p16.a(inputStream, read));
                p16.h0 h0Var2 = (p16.h0) a(hVar, lVar);
                try {
                    hVar.a(0);
                    h0Var = h0Var2;
                } catch (p16.z e17) {
                    e17.f432904d = h0Var2;
                    throw e17;
                }
            }
            b(h0Var);
            return h0Var;
        } catch (java.io.IOException e18) {
            throw new p16.z(e18.getMessage());
        }
    }
}
