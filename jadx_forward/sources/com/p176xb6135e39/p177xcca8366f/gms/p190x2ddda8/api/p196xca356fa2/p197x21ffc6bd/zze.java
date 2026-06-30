package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* loaded from: classes13.dex */
public final class zze implements java.lang.Runnable {

    /* renamed from: zzer */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0 f5692x394bed = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0("RevokeAccessOperation", new java.lang.String[0]);

    /* renamed from: zzes */
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2 f5693x394bee;
    private final java.lang.String zzz;

    private zze(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        this.zzz = str;
        this.f5693x394bee = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1793x54db91a2((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c) null);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> zzg(java.lang.String str) {
        if (str == null) {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1753x7e6f6e7f.m17824xeaf3710b(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(4), null);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zze zzeVar = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zze(str);
        new java.lang.Thread(zzeVar).start();
        return zzeVar.f5693x394bee;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5901x9c108648;
        try {
            java.lang.String valueOf = java.lang.String.valueOf(this.zzz);
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new java.lang.String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                c1763x9432bc12 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5903x535c1c1;
            } else {
                f5692x394bed.e("Unable to revoke access!", new java.lang.Object[0]);
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0 c1959x87fce1b0 = f5692x394bed;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(26);
            sb6.append("Response Code: ");
            sb6.append(responseCode);
            c1959x87fce1b0.d(sb6.toString(), new java.lang.Object[0]);
        } catch (java.io.IOException e17) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0 c1959x87fce1b02 = f5692x394bed;
            java.lang.String valueOf2 = java.lang.String.valueOf(e17.toString());
            c1959x87fce1b02.e(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new java.lang.String("IOException when revoking access: "), new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0 c1959x87fce1b03 = f5692x394bed;
            java.lang.String valueOf3 = java.lang.String.valueOf(e18.toString());
            c1959x87fce1b03.e(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new java.lang.String("Exception when revoking access: "), new java.lang.Object[0]);
        }
        this.f5693x394bee.m17883x209a1f1f(c1763x9432bc12);
    }
}
