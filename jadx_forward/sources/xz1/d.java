package xz1;

/* loaded from: classes15.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final org.json.JSONObject a(xz1.d dVar, qk.u6 u6Var) {
        dVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, u6Var.a());
        xz1.d dVar2 = xz1.k.f539720i;
        jSONObject.put(dm.i4.f66865x76d1ec5a, dVar2.d(u6Var));
        jSONObject.put("description", u6Var.mo52337x993583fc());
        jSONObject.put("webSocketDebuggerUrl", "ws://" + dVar2.d(u6Var));
        jSONObject.put("devtoolsFrontendUrl", "devtools://devtools/bundled/inspector.html?ws=localhost" + dVar2.d(u6Var));
        return jSONObject;
    }

    public static final yz1.h b(xz1.d dVar, yz1.h hVar, yz1.c cVar) {
        dVar.getClass();
        hVar.f550035a.clear();
        java.util.ArrayList arrayList = hVar.f550036b;
        arrayList.clear();
        hVar.f550037c = null;
        java.lang.String a17 = cVar.a();
        if (a17 == null) {
            throw new java.io.IOException("reader:" + cVar + " can not readLine");
        }
        java.lang.String[] strArr = (java.lang.String[]) new r26.t(" ").g(a17, 3).toArray(new java.lang.String[0]);
        if (strArr.length != 3) {
            throw new java.io.IOException("Invalid request line: ".concat(a17));
        }
        java.lang.String str = strArr[0];
        hVar.f550037c = android.net.Uri.parse(strArr[1]);
        java.lang.String str2 = strArr[2];
        while (true) {
            java.lang.String a18 = cVar.a();
            if (a18 == null) {
                throw new java.io.EOFException();
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("", a18)) {
                return hVar;
            }
            java.lang.String[] strArr2 = (java.lang.String[]) new r26.t(": ").g(a18, 2).toArray(new java.lang.String[0]);
            if (strArr2.length != 2) {
                throw new java.io.IOException("Malformed header: ".concat(a18));
            }
            java.lang.String str3 = strArr2[0];
            java.lang.String str4 = strArr2[1];
            hVar.f550035a.add(str3);
            arrayList.add(str4);
        }
    }

    public static final void c(xz1.d dVar, yz1.i iVar, yz1.d dVar2, java.io.OutputStream outputStream) {
        dVar.getClass();
        yz1.f fVar = iVar.f550040e;
        if (fVar != null) {
            iVar.a("Content-Type", ((yz1.e) fVar).f550033a);
            iVar.a("Content-Length", java.lang.String.valueOf(((yz1.e) iVar.f550040e).f550034b.length));
        }
        dVar.e(iVar, dVar2);
        yz1.f fVar2 = iVar.f550040e;
        if (fVar2 != null) {
            outputStream.write(((yz1.e) fVar2).f550034b);
        }
    }

    public final java.lang.String d(qk.u6 u6Var) {
        return "/page/" + u6Var.mo52338x337a8b();
    }

    public final void e(yz1.i response, yz1.d writer) {
        java.io.BufferedOutputStream bufferedOutputStream;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(writer, "writer");
        java.lang.String str = "HTTP/1.1 " + response.f550038c + ' ' + response.f550039d;
        int length = str.length();
        int i17 = 0;
        while (true) {
            bufferedOutputStream = writer.f550032a;
            if (i17 >= length) {
                break;
            }
            bufferedOutputStream.write(str.charAt(i17));
            i17++;
        }
        bufferedOutputStream.write(yz1.d.f550031b);
        java.util.ArrayList arrayList = response.f550035a;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.String str2 = ((java.lang.String) arrayList.get(i18)) + ": " + ((java.lang.String) response.f550036b.get(i18));
            int length2 = str2.length();
            for (int i19 = 0; i19 < length2; i19++) {
                bufferedOutputStream.write(str2.charAt(i19));
            }
            bufferedOutputStream.write(yz1.d.f550031b);
        }
        bufferedOutputStream.write(yz1.d.f550031b);
        bufferedOutputStream.flush();
    }
}
