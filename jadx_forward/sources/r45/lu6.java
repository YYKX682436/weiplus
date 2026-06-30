package r45;

/* loaded from: classes12.dex */
public class lu6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.e implements r45.my3 {
    public lu6() {
        super(com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(1, "BaseRequest", r45.he.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(2, "ClientImgId", r45.du5.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(3, "FromUserName", r45.du5.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(4, "ToUserName", r45.du5.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(5, "TotalLen"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(6, "StartPos"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(7, "DataLen"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(8, "ImgData", r45.cu5.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(9, "MsgType"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(10, "MsgSource"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(11, "CompressType"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(12, "NetType"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(13, "PhotoFrom"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(14, "MediaId"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(15, "CDNBigImgUrl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(16, "CDNMidImgUrl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(17, "AESKey"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(18, "EncryVer"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(19, "CDNBigImgSize"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(20, "CDNMidImgSize"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(21, "CDNThumbImgUrl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(22, "CDNThumbImgSize"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(23, "CDNThumbImgHeight"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(24, "CDNThumbImgWidth"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(25, "CDNThumbAESKey"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(26, "ReqTime"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(27, "Md5"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(28, "CRC32"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(29, "MsgForwardType"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(30, "HitMd5"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(31, "AppId"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(32, "MessageAction"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(33, "MessageExt"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(34, "MediaTagName"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(35, "SendMsgTicket"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(36, "ImgType"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(37, "ImgInfo"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(38, "PlatformSignature"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(39, "ImgDataHash"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(40, "ImgSourceUrl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(41, "HevcMidSize"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(42, "RawMd5"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(43, "OriginSourceMd5"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(44, "ImgSourceInfo", r45.gz3.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(45, "ImgWxaInfo", r45.hz3.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(47, "SecHashInfoBase64"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(49, "LiveDuration"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(50, "LiveVideoSize"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(51, "LiveVideoMd5"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(52, "LiveVideoFileid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(53, "LiveHDVideoSize"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(54, "LiveHDVideoMd5"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(55, "LiveHDVideoFileid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(56, "ExtCommonInfoXml"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(57, "ImgMpInfo", r45.ez3.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(58, "LivePhotoStillImageTimeMs"));
        this.f38874x227b759e = true;
    }

    @Override // r45.my3
    /* renamed from: getBaseRequest */
    public final r45.he mo11508xa452ad48() {
        return (r45.he) m75936x14adae67(0);
    }

    @Override // r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        set(0, heVar);
        return this;
    }
}
