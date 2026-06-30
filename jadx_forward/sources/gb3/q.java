package gb3;

/* loaded from: classes12.dex */
public abstract class q {
    public static void a(java.lang.StringBuilder sb6, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, int i17) {
        if (interfaceC4987x84e327cb == null) {
            return;
        }
        sb6.append("<emoji>");
        sb6.append("<localreceivestatus>");
        sb6.append(i17);
        sb6.append("</localreceivestatus>");
        sb6.append("<md5>");
        sb6.append(ot0.q.g(interfaceC4987x84e327cb.H0()));
        sb6.append("</md5>");
        sb6.append("<type>");
        sb6.append(interfaceC4987x84e327cb.mo42936xfb85f7b0());
        sb6.append("</type>");
        sb6.append("<width>");
        sb6.append(interfaceC4987x84e327cb.mo42937x755bd410());
        sb6.append("</width>");
        sb6.append("<height>");
        sb6.append(interfaceC4987x84e327cb.mo42931x1c4fb41d());
        sb6.append("</height>");
        sb6.append("<len>");
        sb6.append(interfaceC4987x84e327cb.mo42935xfb854877());
        sb6.append("</len>");
        sb6.append("<aeskey>");
        sb6.append(ot0.q.g(interfaceC4987x84e327cb.mo42927x1061ea06()));
        sb6.append("</aeskey>");
        sb6.append("<cdnurl>");
        sb6.append(ot0.q.g(interfaceC4987x84e327cb.l0()));
        sb6.append("</cdnurl>");
        sb6.append("<encrypturl>");
        sb6.append(ot0.q.g(interfaceC4987x84e327cb.J1()));
        sb6.append("</encrypturl>");
        sb6.append("<externurl>");
        sb6.append(ot0.q.g(interfaceC4987x84e327cb.Z()));
        sb6.append("</externurl>");
        sb6.append("<externmd5>");
        sb6.append(ot0.q.g(interfaceC4987x84e327cb.g1()));
        sb6.append("</externmd5>");
        sb6.append("<productid>");
        sb6.append(ot0.q.g(interfaceC4987x84e327cb.mo42930x4f4a97c4()));
        sb6.append("</productid>");
        sb6.append("<designerid>");
        sb6.append(ot0.q.g(interfaceC4987x84e327cb.X0()));
        sb6.append("</designerid>");
        sb6.append("<attachedtext>");
        sb6.append(ot0.q.g(interfaceC4987x84e327cb.q0()));
        sb6.append("</attachedtext>");
        sb6.append("</emoji>");
    }
}
